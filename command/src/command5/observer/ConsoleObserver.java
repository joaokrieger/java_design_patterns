package command5.observer;

import java.util.List;

import command5.Musica;

public class ConsoleObserver implements Observer{

	@Override
	public void adicionandoMusica(String nome) {
		System.out.println("Música: "+nome+" adicionada ao carrinho!");
	}

	@Override
	public void buscouDados(List<Musica> lista) {
		for(Musica m:lista) {
			System.out.println(m);
		}
	}

	@Override
	public void listandoTamanhoMusica(int tamanho) {
		System.out.println(tamanho+"MB");
	}

	@Override
	public void listandoPrecoTotal(float preco) {
		System.out.println("R$"+preco);
	}



}
