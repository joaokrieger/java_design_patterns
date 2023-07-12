package decorator5.decorator;

import decorator5.Orc;

public abstract class OrcDecorator implements Orc{

	private Orc orc;

	public OrcDecorator(Orc orc) {
		this.orc = orc;
	}
	
	@Override
	public int getSaude() {
		return orc.getSaude();
	}

	@Override
	public void setSaude(int saude) {
		orc.setSaude(saude);
	}

	@Override
	public int atacar() {
		return orc.atacar();
	}

	@Override
	public void defender(int ataque) {
		orc.defender(ataque);
	}

}
