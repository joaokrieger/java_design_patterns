package tmFm.control;

import javax.swing.ImageIcon;

import tmFm.model.Agua;
import tmFm.model.Heroi;
import tmFm.model.HeroiAgua;
import tmFm.model.Peca;

public class MovimentoHeroiAgua extends MovimentoHeroi{

	@Override
	protected Heroi criarPeca() {
		return new HeroiAgua(new ImageIcon("imagens/herowater.png"));
	}

	@Override
	protected boolean validarOutrosTiposCasas(Peca peca) {
		
		if(peca.getClass() == Agua.class)
			return true;
		else
			return false;
	}

}
