package visitor4.personagens;

import visitor4.visitor.PersonagemVisitor;

public class Catapulta extends Personagem {

	public Catapulta() {
		super(8, 5);
	}

	@Override
	public void accept(PersonagemVisitor visitor) {
		visitor.VisitCatapulta(this);
	}

}
