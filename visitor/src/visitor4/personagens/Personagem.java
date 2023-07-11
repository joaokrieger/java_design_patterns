package visitor4.personagens;

import visitor4.visitor.PersonagemVisitor;

public abstract class Personagem {

	private int pontoVida;
	private int forcaAtaque;
	
	public Personagem(int pontoVida, int forcaAtaque) {
		this.pontoVida = pontoVida;
		this.forcaAtaque = forcaAtaque;
	}

	public int getPontoVida() {
		return pontoVida;
	}

	public void setPontoVida(int pontoVida) {
		this.pontoVida = pontoVida;
	}
	
	public int getForcaAtaque() {
		return forcaAtaque;
	}
	
	public abstract void accept(PersonagemVisitor visitor);
}
