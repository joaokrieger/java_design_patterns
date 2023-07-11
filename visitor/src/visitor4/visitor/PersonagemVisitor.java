package visitor4.visitor;

import visitor4.personagens.Arqueiro;
import visitor4.personagens.Catapulta;
import visitor4.personagens.Lanceiro;

public interface PersonagemVisitor {
	
	void VisitLanceiro(Lanceiro lanceiro);
	void VisitArqueiro(Arqueiro arqueiro);
	void VisitCatapulta(Catapulta catapulta);
}
