package decorator5.decorator;

import java.util.Random;

import decorator5.Orc;

public class Machado extends OrcDecorator{

	public Machado(Orc orc) {
		super(orc);
	}
	
	@Override
	public int atacar() {
		return super.atacar() + new Random().nextInt(1, 5);
	}

}
