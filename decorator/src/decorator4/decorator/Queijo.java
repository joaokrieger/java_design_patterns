package decorator4.decorator;

import decorator4.modelo.Sanduiche;

public class Queijo extends SanduicheDecorator{

	public Queijo(Sanduiche sanduiche) {
		super(sanduiche);
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 0.75;
	}
	
	@Override
	public String toString() {
		return "Queijo "+super.toString();
	}
}
