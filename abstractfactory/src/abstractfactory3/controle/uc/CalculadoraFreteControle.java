package abstractfactory3.controle.uc;

import abstractfactory3.controle.abstractfactory.Destino;
import abstractfactory3.controle.observer.Observador;

public interface CalculadoraFreteControle {
	
	void calcularFrete(int altura, int largura, int profundidade, int peso, Destino destino);

	void addObservador(Observador observador);

	void setTipoFrete(String tipoFrete);

	void setTipoEncomenda(String tipoEncomenda);
}
