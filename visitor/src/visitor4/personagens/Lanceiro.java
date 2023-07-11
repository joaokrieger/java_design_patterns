package visitor4.personagens;

import visitor4.visitor.PersonagemVisitor;

public class Lanceiro extends Personagem {

	public Lanceiro() {
		super(10, 1);
	}

	@Override
	public void accept(PersonagemVisitor visitor) {
		visitor.VisitLanceiro(this);
	}

}
