package decorator4.decorator;

import decorator4.modelo.Sanduiche;

public class Pao extends SanduicheDecorator {

	public Pao(Sanduiche sanduiche) {
		super(sanduiche);
	}
	
	@Override
	public double getPreco() {
		return super.getPreco() + 0.5;
	}
	
	@Override
	public String toString() {
		return "Pão "+super.toString();
	}
}
