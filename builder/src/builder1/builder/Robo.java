package builder1.builder;

import builder1.produto.Carro;

// Builder abstrato
public abstract class Robo {

	protected Carro carro;

	public void construirMotor() { }
	public void construirPneus() { }
	
	public void reset() {
		this.carro = new Carro();
	}
	
	public Carro getResult() {
		return carro;
	}
	
}
