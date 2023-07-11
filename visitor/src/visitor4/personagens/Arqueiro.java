package visitor4.personagens;

import visitor4.visitor.PersonagemVisitor;

public class Arqueiro extends Personagem {

	public Arqueiro() {
		super(15, 2);
	}

	@Override
	public void accept(PersonagemVisitor visitor) {
		visitor.VisitArqueiro(this);
	}

}
