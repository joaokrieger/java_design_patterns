package command1.command;

import command1.controle.Calculadora;

public class MultiplicaCommand extends CalculadoraCommand {

	public MultiplicaCommand(Calculadora calc, int valor) {
		super(calc, valor);
	}

	@Override
	public void execute() {
		calc.multiplicar(valor);
	}

	@Override
	public void undo() {
		calc.dividir(valor);
		
	}

	@Override
	public void redo() {
		execute();
	}

}
