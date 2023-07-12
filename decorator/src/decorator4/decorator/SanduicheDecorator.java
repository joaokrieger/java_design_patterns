package decorator4.decorator;

import decorator4.modelo.Sanduiche;

public abstract class SanduicheDecorator implements Sanduiche {

	
	private Sanduiche sanduiche;

	public SanduicheDecorator(Sanduiche sanduiche) {
		this.sanduiche = sanduiche;
	}
	
	@Override
	public double getPreco() {
		return this.sanduiche.getPreco();
	}
	
	@Override
	public String toString() {
		return this.sanduiche.toString();
	}

}
