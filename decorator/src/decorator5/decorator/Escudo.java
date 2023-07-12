package decorator5.decorator;

import decorator5.Orc;

public class Escudo extends OrcDecorator{

	public Escudo(Orc orc) {
		super(orc);
	}
	
	@Override
	public void defender(int ataque) {
		super.defender(ataque -7);
	}

}
