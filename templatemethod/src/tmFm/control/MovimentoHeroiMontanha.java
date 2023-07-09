package tmFm.control;

import javax.swing.ImageIcon;

import tmFm.model.Heroi;
import tmFm.model.HeroiMontanha;
import tmFm.model.Montanha;
import tmFm.model.Peca;

public class MovimentoHeroiMontanha extends MovimentoHeroi{

	@Override
	protected Heroi criarPeca() {
		return new HeroiMontanha(new ImageIcon("imagens/heromountain.png"));
	}

	@Override
	protected boolean validarOutrosTiposCasas(Peca peca) {
		
		if(peca.getClass() == Montanha.class)
			return true;
		else
			return false;
	}

}
