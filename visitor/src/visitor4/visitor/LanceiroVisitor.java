package visitor4.visitor;

import visitor4.personagens.Arqueiro;
import visitor4.personagens.Catapulta;
import visitor4.personagens.Lanceiro;
import visitor4.personagens.Personagem;

public class LanceiroVisitor implements PersonagemVisitor {

	private Personagem atacante;

	public LanceiroVisitor(Personagem personagem) {
		this.atacante = personagem;
	}
	
	@Override
	public void VisitLanceiro(Lanceiro lanceiro) {
		lanceiro.setPontoVida(lanceiro.getPontoVida() - this.atacante.getForcaAtaque());
	}

	@Override
	public void VisitArqueiro(Arqueiro arqueiro) {
		arqueiro.setPontoVida(arqueiro.getPontoVida() - (this.atacante.getForcaAtaque() - 1));	
	}

	@Override
	public void VisitCatapulta(Catapulta catapulta) {
		catapulta.setPontoVida(catapulta.getPontoVida() - this.atacante.getForcaAtaque());
	}

}
