package command1.command;

import command1.controle.Calculadora;

public class AddCommand extends CalculadoraCommand {

	public AddCommand(Calculadora calc, int valor) {
		super(calc, valor);
	}

	@Override
	public void execute() {
		
		calc.add(valor);

	}

	@Override
	public void undo() {
		
		calc.subtrair(valor);

	}

	@Override
	public void redo() {
		
		calc.add(valor);

	}
	
	@Override
	public String toString() {
		return " + " + valor;
	}

}
