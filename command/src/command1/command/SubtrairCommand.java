package command1.command;
import command1.controle.Calculadora;

public class SubtrairCommand extends CalculadoraCommand {

	public SubtrairCommand(Calculadora calc, int valor) {
		super(calc, valor);
	}

	@Override
	public void execute() {
		
		calc.subtrair(valor);
	}

	@Override
	public void undo() {
		
		calc.add(valor);

	}

	@Override
	public void redo() {
		
		calc.subtrair(valor);

	}
	
	@Override
	public String toString() {
		return " - " + valor;
	}

}
