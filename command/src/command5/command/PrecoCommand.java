package command5.command;

import java.util.List;

import command5.CarrinhoCompras;
import command5.Musica;
import command5.observer.Observer;

public class PrecoCommand extends Command {

	private CarrinhoCompras carrinhoCompras;

	public PrecoCommand(Observer observer, CarrinhoCompras cc) {
		super(observer);
		this.carrinhoCompras = cc;
	}

	@Override
	public void execute() {
		
		float preco = 0;
		
		List<Musica> lista = this.carrinhoCompras.getProdutos();
		for(Musica m:lista) {
			preco += m.getPreco();
		}
		
		this.observer.listandoPrecoTotal(preco);
	}

	@Override
	public void undo() {}

	@Override
	public void redo() {
		execute();
	}

}
