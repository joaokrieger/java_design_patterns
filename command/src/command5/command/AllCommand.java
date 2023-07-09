package command5.command;

import java.util.List;

import command3.dao.BancoPessoas;
import command3.modelo.Pessoa;
import command5.CarrinhoCompras;
import command5.Musica;
import command5.observer.Observer;

public class AllCommand extends Command {

	private CarrinhoCompras carrinhoCompras;

	public AllCommand(Observer observer, CarrinhoCompras cc) {
		super(observer);
		this.carrinhoCompras = cc;
	}

	@Override
	public void execute() {
		List<Musica> lista = carrinhoCompras.getProdutos();
		this.observer.buscouDados(lista);
	}

	@Override
	public void undo() {}

	@Override
	public void redo() {
		execute();
	}
}
