package observer0;

import java.util.ArrayList;
import java.util.List;

public class Incrementar {

	private static Incrementar instancia;
	private int conta;
	
	private List<Observador> observadores = new ArrayList<>();
	
	private Incrementar() {}
	
	public static Incrementar getInstancia() {
		if (instancia == null)
			instancia = new Incrementar();
		
		return instancia;
	}
	
	public int getConta() {
		return conta;
	}

	public void inc() {
		conta++;
		notificar();
	}
	
	
	public void anexar(Observador obs) {
		this.observadores.add(obs);
	}
	
	public void notificar() {
		for(Observador obs:observadores) {
			obs.atualizarValor(conta);
		}
	}
}
