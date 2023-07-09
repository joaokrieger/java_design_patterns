package command2.command;

import command2.controle.Deposito;

public class RemoverEstoque implements Command {

	private Deposito deposito;
	private int qtdade;

	public RemoverEstoque(Deposito deposito, int qtdade) {
		this.deposito = deposito;
		this.qtdade = qtdade;
	}

	@Override
	public void execute() {
		deposito.remove(qtdade);
	}

	@Override
	public void undo() {
		deposito.add(qtdade);
	}

	@Override
	public void redo() {
		execute();
	}

}
