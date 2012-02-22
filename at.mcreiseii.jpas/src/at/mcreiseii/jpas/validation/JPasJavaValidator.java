package at.mcreiseii.jpas.validation;
 
import org.eclipse.xtext.validation.Check;
import at.mcreiseii.jpas.jPas.*;

public class JPasJavaValidator extends AbstractJPasJavaValidator {
	
	@Check
	public void CheckVariableDuplicates(VariableDeclaration VarDecl){
		for(Variable var : VarDecl.getVariables()){
			if(VarDecl.getVariables().toString().indexOf(var.getName(), 0) != VarDecl.getVariables().toString().lastIndexOf(var.getName())){
				error("Duplicate variable definition " + var.getName(), null);
			} // if
		} // for
	} // CheckVariableDuplicates

	/*@Check
	public void CheckDuplicateFunctionParams(Function func){
		for(Param par : func.getParams()){
			if(func.getParams().toString().indexOf(par.getName(), 0) != func.getParams().toString().lastIndexOf(par.getName())){
				error("Duplicate param definition " + par.getName(), JPasPackage.Literals.PARAM__NAME);
			} // if
		} // for
	} // CheckDuplicateFunctionParams
	
	@Check
	public void CheckDuplicateProcedureParams(Procedure proc){
		for(ProcParam par : proc.getParams()){
			if(proc.getParams().toString().indexOf(par.getName(), 0) != proc.getParams().toString().lastIndexOf(par.getName())){
				error("Duplicate param definition " + par.getName(), JPasPackage.Literals.PROC_PARAM__NAME);
			} // if
		} // for
	} // CheckDuplicateProcedureParams*/
	
}
