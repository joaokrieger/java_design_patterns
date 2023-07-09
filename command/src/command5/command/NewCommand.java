package command5.command;

import command5.CarrinhoCompras;
import command5.Musica;
import command5.observer.Observer;

public class NewCommand extends Command{

	private CarrinhoCompras carrinhoCompras;
	private Musica musica;

	public NewCommand(Observer observer, CarrinhoCompras cc, Musica m) {
		super(observer);
		this.carrinhoCompras = cc;
		this.musica = m;
	}

	@Override
	public void execute() {
		carrinhoCompras.add(musica);
		this.observer.adicionandoMusica(musica.getNome());
	}

	@Override
	public void undo() {}

	@Override
	public void redo() {
		execute();
	}

}
