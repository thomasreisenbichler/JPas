package at.mcreiseii.jpas.generator;

import at.mcreiseii.jpas.generator.ResourceExtensions;
import at.mcreiseii.jpas.jPas.Datatype;
import at.mcreiseii.jpas.jPas.Function;
import at.mcreiseii.jpas.jPas.Method;
import at.mcreiseii.jpas.jPas.Param;
import at.mcreiseii.jpas.jPas.ProcParam;
import at.mcreiseii.jpas.jPas.Procedure;
import at.mcreiseii.jpas.jPas.Program;
import at.mcreiseii.jpas.jPas.Statement;
import at.mcreiseii.jpas.jPas.StatementSequence;
import at.mcreiseii.jpas.jPas.Variable;
import at.mcreiseii.jpas.jPas.VariableDeclaration;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class JPasGenerator implements IGenerator {
  private int paramcount = 0;
  
  private int count = 0;
  
  @Inject
  private IQualifiedNameProvider nameProvider;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    Iterable<Program> _filter = IterableExtensions.<Program>filter(_allContentsIterable, at.mcreiseii.jpas.jPas.Program.class);
    for (final Program e : _filter) {
      QualifiedName _fullyQualifiedName = this.nameProvider.getFullyQualifiedName(e);
      String _string = _fullyQualifiedName.toString();
      String _replace = _string.replace(".", "/");
      String _operator_plus = StringExtensions.operator_plus(_replace, ".java");
      CharSequence _compile = this.compile(e);
      fsa.generateFile(_operator_plus, _compile);
    }
  }
  
  public CharSequence compile(final Program p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.lang.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = p.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Method> _methods = p.getMethods();
      for(final Method m : _methods) {
        _builder.append("\t");
        CharSequence _compile = this.compile(m);
        _builder.append(_compile, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("public static void main (int argc, char** argv){");
    _builder.newLine();
    {
      VariableDeclaration _variableDeclaration = p.getVariableDeclaration();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_variableDeclaration, null);
      if (_operator_notEquals) {
        {
          VariableDeclaration _variableDeclaration_1 = p.getVariableDeclaration();
          EList<Variable> _variables = _variableDeclaration_1.getVariables();
          for(final Variable variable : _variables) {
            _builder.append("\t\t");
            CharSequence _compile_1 = this.compile(variable);
            _builder.append(_compile_1, "		");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      StatementSequence _statementsequence = p.getStatementsequence();
      EList<Statement> _statements = _statementsequence.getStatements();
      for(final Statement state : _statements) {
        _builder.append("\t\t");
        CharSequence _compile_2 = this.compile(state);
        _builder.append(_compile_2, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("} /* main */");
    _builder.newLine();
    _builder.append("} /* ");
    String _name_1 = p.getName();
    _builder.append(_name_1, "");
    _builder.append(" */");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Method m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Function _function = m.getFunction();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_function, null);
      if (_operator_notEquals) {
        Function _function_1 = m.getFunction();
        CharSequence _compile = this.compile(_function_1);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Procedure _procedure = m.getProcedure();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_procedure, null);
      if (_operator_notEquals_1) {
        Procedure _procedure_1 = m.getProcedure();
        CharSequence _compile_1 = this.compile(_procedure_1);
        _builder.append(_compile_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Function func) {
    StringConcatenation _builder = new StringConcatenation();
    EList<Param> _params = func.getParams();
    int _size = _params.size();
    final int paramcount = _size;
    _builder.newLineIfNotEmpty();
    _builder.append("public ");
    Datatype _returntype = func.getReturntype();
    _builder.append(_returntype, "");
    _builder.append(" ");
    String _name = func.getName();
    _builder.append(_name, "");
    _builder.append(" (");
    {
      EList<Param> _params_1 = func.getParams();
      for(final Param par : _params_1) {
        int _operator_plus = IntegerExtensions.operator_plus(this.count, 1);
        final int count = _operator_plus;
        Datatype _type = par.getType();
        _builder.append(_type, "");
        _builder.append(" ");
        String _name_1 = par.getName();
        _builder.append(_name_1, "");
        {
          boolean _operator_lessThan = IntegerExtensions.operator_lessThan(count, paramcount);
          if (_operator_lessThan) {
            _builder.append(", ");
          }
        }
      }
    }
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    {
      VariableDeclaration _variableDeclaration = func.getVariableDeclaration();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_variableDeclaration, null);
      if (_operator_notEquals) {
        {
          VariableDeclaration _variableDeclaration_1 = func.getVariableDeclaration();
          EList<Variable> _variables = _variableDeclaration_1.getVariables();
          for(final Variable variable : _variables) {
            _builder.append("\t");
            CharSequence _compile = this.compile(variable);
            _builder.append(_compile, "	");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("} /* ");
    String _name_2 = func.getName();
    _builder.append(_name_2, "");
    _builder.append(" */");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Procedure proc) {
    StringConcatenation _builder = new StringConcatenation();
    EList<ProcParam> _params = proc.getParams();
    int _size = _params.size();
    final int paramcount = _size;
    _builder.newLineIfNotEmpty();
    _builder.append("public void ");
    String _name = proc.getName();
    _builder.append(_name, "");
    _builder.append(" (");
    {
      EList<ProcParam> _params_1 = proc.getParams();
      for(final ProcParam par : _params_1) {
        int _operator_plus = IntegerExtensions.operator_plus(this.count, 1);
        final int count = _operator_plus;
        Datatype _type = par.getType();
        _builder.append(_type, "");
        _builder.append(" ");
        String _name_1 = par.getName();
        _builder.append(_name_1, "");
        {
          boolean _operator_lessThan = IntegerExtensions.operator_lessThan(count, paramcount);
          if (_operator_lessThan) {
            _builder.append(", ");
          }
        }
      }
    }
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    {
      VariableDeclaration _variableDeclaration = proc.getVariableDeclaration();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_variableDeclaration, null);
      if (_operator_notEquals) {
        {
          VariableDeclaration _variableDeclaration_1 = proc.getVariableDeclaration();
          EList<Variable> _variables = _variableDeclaration_1.getVariables();
          for(final Variable variable : _variables) {
            _builder.append("\t");
            CharSequence _compile = this.compile(variable);
            _builder.append(_compile, "	");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("} /* ");
    String _name_2 = proc.getName();
    _builder.append(_name_2, "");
    _builder.append(" */");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Variable variable) {
    StringConcatenation _builder = new StringConcatenation();
    Datatype _type = variable.getType();
    _builder.append(_type, "");
    _builder.append(" ");
    String _name = variable.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Statement state) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
}
