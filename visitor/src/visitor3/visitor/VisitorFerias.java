package visitor3.visitor;

import visitor3.empresa.FuncNivelA;
import visitor3.empresa.FuncNivelB;
import visitor3.empresa.Gerente;

public class VisitorFerias implements FuncionarioVisitor{
	
	private int totalFuncionarios = 0;
	
	@Override
	public void visitGerente(Gerente gerente) {
		gerente.setFeriasAGozar(10);
		totalFuncionarios++;
	}

	@Override
	public void visitFuncNivelA(FuncNivelA funcionario) {
		if(funcionario.getSalario() >= 5000) {
			funcionario.setFeriasAGozar(10);
			totalFuncionarios++;
		}
	}

	@Override
	public void visitFuncNivelB(FuncNivelB funcionario) {
		if(funcionario.getSalario() >= 1500) {
			funcionario.setFeriasAGozar(5);
			totalFuncionarios++;
		}
		
	}
	
	public int getTotalFuncionarios() {
		return totalFuncionarios;
	}

}
