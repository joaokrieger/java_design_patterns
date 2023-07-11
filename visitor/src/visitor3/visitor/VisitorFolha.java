package visitor3.visitor;

import visitor3.empresa.FuncNivelA;
import visitor3.empresa.FuncNivelB;
import visitor3.empresa.Gerente;

public class VisitorFolha implements FuncionarioVisitor{

	private double salarioTotal;
	
	@Override
	public void visitGerente(Gerente gerente) {
		this.salarioTotal += gerente.getSalario();
	}

	@Override
	public void visitFuncNivelA(FuncNivelA funcionario) {
		this.salarioTotal += funcionario.getSalario();
	}

	@Override
	public void visitFuncNivelB(FuncNivelB funcionario) {
		this.salarioTotal += funcionario.getSalario();
	}
	
	public double getSalarioTotal() {
		return salarioTotal;
	}

}
