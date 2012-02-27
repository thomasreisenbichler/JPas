package at.mcreiseii.jpas.validation;
 
import org.eclipse.xtext.validation.Check;
import at.mcreiseii.jpas.jPas.*;

public class JPasJavaValidator extends AbstractJPasJavaValidator {
	
	@Check
	public void CheckVariableDuplicates(Variable var){
		VariableDeclaration varDecl = (VariableDeclaration) var.eContainer();
		int count = 0;
		
		for(Variable temp : varDecl.getVariables()){
			if(var.getName().equals(temp.getName())){
				count++;
			} // if
		} // for
		
		if(count>1){
			error("Duplicate variable definition " + var.getName(), JPasPackage.Literals.VARIABLE__NAME);
		} // if
	} // CheckVariableDuplicates

	@Check
	public void CheckDuplicateFunctionParams(Param par){
		Function func = (Function) par.eContainer();
		int count = 0;
		
		for(Param temp : func.getParams()){
			if(par.getName().equals(temp.getName())){
				count++;
			} // if
		} // for
		
		if(count>1){
			error("Duplicate param definition " + par.getName(), JPasPackage.Literals.PARAM__NAME);
		} // if
	} // CheckDuplicateFunctionParams
	
	@Check
	public void CheckDuplicateProcedureParams(ProcParam par){
		Procedure proc = (Procedure) par.eContainer();
		int count = 0;
		
		for(ProcParam temp : proc.getParams()){
			if(par.getName().equals(temp.getName())){
				count++;
			} // if
		} // for
		
		if(count>1){
			error("Duplicate param definition " + par.getName(), JPasPackage.Literals.PROC_PARAM__NAME);
		} // if
	} // CheckDuplicateProcedureParams*/
}
