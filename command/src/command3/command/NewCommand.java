package command3.command;

import command3.dao.BancoPessoas;
import command3.observer.Observer;

public class NewCommand extends Command {

	private int codigo;
	private String nome;

	public NewCommand(Observer observer, String[] dados) {
		super(observer);
		this.codigo = Integer.parseInt(dados[0]);
		this.nome = dados[1];
	}

	@Override
	public void execute() {
		BancoPessoas.getInstance().addPessoa(codigo, nome);
		this.observer.adicionouPessoa(nome);
	}

	@Override
	public void undo() {
		BancoPessoas.getInstance().removerPessoa(codigo);
		this.observer.deletouPessoa(codigo);
	}

	@Override
	public void redo() {
		execute();
	}
}
