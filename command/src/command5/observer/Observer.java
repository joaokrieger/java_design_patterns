package command5.observer;

import java.util.List;

import command5.Musica;

public interface Observer {

	void adicionandoMusica(String nome);
	void buscouDados(List<Musica> lista);
	void listandoTamanhoMusica(int tamanho);
	void listandoPrecoTotal(float preco);

}
