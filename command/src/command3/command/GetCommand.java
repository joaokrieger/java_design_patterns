package command3.command;

import command3.dao.BancoPessoas;
import command3.modelo.Pessoa;
import command3.observer.Observer;

public class GetCommand extends Command {

	private int codigo;

	public GetCommand(Observer observer, String[] dados) {
		super(observer);
		this.codigo = Integer.parseInt(dados[0]);
	}

	@Override
	public void execute() {
		Pessoa p = BancoPessoas.getInstance().getPessoa(codigo);
		
		String[][] res = new String[1][2];
		res[0][0] = p.getId()+"";
		res[0][1] = p.getNome();
		
		this.observer.buscouDados(res);
	}

	@Override
	public void undo() {}

	@Override
	public void redo() {
		execute();
	}

}
