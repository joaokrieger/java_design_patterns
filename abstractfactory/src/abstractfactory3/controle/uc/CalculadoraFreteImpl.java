package abstractfactory3.controle.uc;

import java.util.ArrayList;
import java.util.List;

import abstractfactory3.controle.abstractfactory.AbstractFreteFactory;
import abstractfactory3.controle.abstractfactory.CorreioFactory;
import abstractfactory3.controle.abstractfactory.Destino;
import abstractfactory3.controle.abstractfactory.ExpressoFactory;
import abstractfactory3.controle.modelo.Encomenda;
import abstractfactory3.controle.observer.Observador;

public class CalculadoraFreteImpl implements CalculadoraFreteControle {

	private AbstractFreteFactory freteFactory;
	private List<Observador> obss = new ArrayList<>();
	private Encomenda encomenda;

	@Override
	public void calcularFrete(int altura, int largura, int profundidade, int peso, Destino destino) {

		try {
			encomenda.setDimensoes(largura, altura, profundidade);
			encomenda.setPeso(peso);
			encomenda.setDestino(destino);
			
			double preco = encomenda.getPreco();
			for (Observador obs:obss)
				obs.notificarPrecoCalculado(preco);
			
		} catch (Exception e) {

			notificarMensagemErro(e.getMessage());
		}

	}

	@Override
	public void addObservador(Observador observador) {
		obss.add(observador);
	}

	@Override
	public void setTipoFrete(String tipoFrete) {

		if (tipoFrete.equals("Correio")) {
			this.freteFactory = new CorreioFactory();
		} else {
			// criar o concretefactory de exportar para america do norte
			this.freteFactory = new ExpressoFactory();
		}

		for (Observador obs : obss) {
			obs.tipoFreteSetado();
		}

	}

	@Override
	public void setTipoEncomenda(String tipoEncomenda) {

		try {
			if (tipoEncomenda.equals("Expresso")) {
				this.encomenda = freteFactory.prepararEncomendaExpresso();
			} else {
				this.encomenda = freteFactory.prepararEncomendaNormal();
			}

			for (Observador obs : obss) {
				obs.tipoEncomendaSetado();
			}

		} catch (Exception e) {
			notificarMensagemErro(e.getMessage());
		}

	}

	private void notificarMensagemErro(String mensagem) {
		for (Observador obs : obss) {
			obs.msgErro(mensagem);
		}
	}

}
