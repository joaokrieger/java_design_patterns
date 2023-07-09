package command3.command;
import command3.dao.BancoPessoas;
import command3.modelo.Pessoa;
import command3.observer.Observer;

public class AllCommand extends Command {

	public AllCommand(Observer observer) {
		super(observer);
	}

	@Override
	public void execute() {
		
		Pessoa[] pessoas = BancoPessoas.getInstance().getAll();
		String[][] res = new String[pessoas.length][2];
		for (int i=0; i<pessoas.length; i++) {
			res[i][0] = pessoas[i].getId() + "";
			res[i][1] = pessoas[i].getNome();
		}

		this.observer.buscouDados(res);
		
	}

	@Override
	public void undo() {
		// Esse Command nao precisa de undo
	}

	@Override
	public void redo() {
		// Esse Command nao precisa de redo
	}

}
