package decorator5;

import decorator5.decorator.Machado;
import decorator5.decorator.Escudo;
import decorator5.decorator.JoiaVida;

public class Sistema {

	public static void main(String[] args) {
		
		Orc orc = new OrcBasico();
		System.out.println("Saúde Inicial do Orc Pelado: " + orc.getSaude());
		
		System.out.println("Orc Pelado Atacando com " + orc.atacar() + " de força");
		orc.defender(10);
		System.out.println("Vida do Orc Pelado após defender ataque: " + orc.getSaude());

		System.out.println("======================================================================");
		
		Orc orcBufado = new Machado(new Escudo(new OrcBasico()));
		
		System.out.println("Saúde Inicial do Orc Bufado: " + orcBufado.getSaude());
		System.out.println("Orc Bufado Atacando com " + orcBufado.atacar() + " de força");
		orcBufado.defender(10);
		System.out.println("Vida do Orc Bufado após defender ataque: " + orcBufado.getSaude());

		System.out.println("=========================================================================");
		
		Orc orcTunadasso = new Machado(new Escudo(new JoiaVida(new OrcBasico())));
		
		System.out.println("Saúde Inicial do Orc Tunadasso: " + orcTunadasso.getSaude());
		System.out.println("Orc Tunadasso  Atacando com " + orcTunadasso.atacar() + " de força");
		orcTunadasso.defender(10);
		System.out.println("Vida do Orc Tunadasso após defender ataque: " + orcTunadasso.getSaude());

		System.out.println("===============================================================================");
	}
}
