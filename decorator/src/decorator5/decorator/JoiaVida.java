package decorator5.decorator;

import decorator5.Orc;

public class JoiaVida extends OrcDecorator{

	public JoiaVida(Orc orc) {
		super(orc);
		orc.setSaude((int)(getSaude() + (getSaude() * 0.2)));
	}	
	
	@Override
	public void setSaude(int saude) {
		super.setSaude(saude);
	}
}
