package command5.command;

import java.util.List;

import command5.CarrinhoCompras;
import command5.Musica;
import command5.observer.Observer;

public class TamanhoCommand extends Command {

	private CarrinhoCompras carrinhoCompras;

	public TamanhoCommand(Observer observer, CarrinhoCompras cc) {
		super(observer);
		this.carrinhoCompras = cc;
	}

	@Override
	public void execute() {
		
		int nrtamanho = 0;
		
		List<Musica> lista = this.carrinhoCompras.getProdutos();
		for(Musica m:lista) {
			nrtamanho += m.getTamanho();
		}
		
		this.observer.listandoTamanhoMusica(nrtamanho);
	}

	@Override
	public void undo() {}

	@Override
	public void redo() {
		execute();
	}

}
