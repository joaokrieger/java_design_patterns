package command3.command;

import command3.dao.BancoPessoas;
import command3.modelo.Pessoa;
import command3.observer.Observer;

public class DeleteCommand extends Command{

	private int codigo;

	public DeleteCommand(Observer observer, String[] dados) {
		super(observer);
		this.codigo = Integer.parseInt(dados[0]);
	}

	@Override
	public void execute() {
		BancoPessoas.getInstance().removerPessoa(codigo);
		this.observer.deletouPessoa(codigo);
	}

	@Override
	public void undo() {
		Pessoa p = BancoPessoas.getInstance().getPessoa(codigo);
		BancoPessoas.getInstance().addPessoa(p.getId(), p.getNome());
		this.observer.adicionouPessoa(p.getNome());
	}

	@Override
	public void redo() {
		execute();
	}

}
