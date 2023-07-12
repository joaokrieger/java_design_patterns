package decorator4.decorator;

import decorator4.modelo.Sanduiche;

public class Hamburguer extends SanduicheDecorator{

	public Hamburguer(Sanduiche sanduiche) {
		super(sanduiche);
	}
	
	@Override
	public double getPreco() {
		return super.getPreco() + 2;
	}
	
	@Override
	public String toString() {
		return "Hamburguer "+super.toString();
	}

}
