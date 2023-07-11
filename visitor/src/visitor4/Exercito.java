package visitor4;

import java.util.ArrayList;
import java.util.List;

import visitor4.personagens.Personagem;
import visitor4.visitor.PersonagemVisitor;

public class Exercito {

	private List<Personagem> personagens = new ArrayList<>();
	
	public void add(Personagem p) {
		personagens.add(p);
	}
	
	public void accept(PersonagemVisitor visitor) {
		for(Personagem p:personagens) {
			p.accept(visitor);
		}
	}
}
