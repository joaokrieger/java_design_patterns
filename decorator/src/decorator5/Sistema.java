package decorator5;

import decorator5.decorator.Machado;
import decorator5.decorator.Escudo;
import decorator5.decorator.JoiaVida;

public class Sistema {

	public static void main(String[] args) {
		
		Orc orc = new OrcBasico();
		System.out.println("Sa�de Inicial do Orc Pelado: " + orc.getSaude());
		
		System.out.println("Orc Pelado Atacando com " + orc.atacar() + " de for�a");
		orc.defender(10);
		System.out.println("Vida do Orc Pelado ap�s defender ataque: " + orc.getSaude());

		System.out.println("======================================================================");
		
		Orc orcBufado = new Machado(new Escudo(new OrcBasico()));
		
		System.out.println("Sa�de Inicial do Orc Bufado: " + orcBufado.getSaude());
		System.out.println("Orc Bufado Atacando com " + orcBufado.atacar() + " de for�a");
		orcBufado.defender(10);
		System.out.println("Vida do Orc Bufado ap�s defender ataque: " + orcBufado.getSaude());

		System.out.println("=========================================================================");
		
		Orc orcTunadasso = new Machado(new Escudo(new JoiaVida(new OrcBasico())));
		
		System.out.println("Sa�de Inicial do Orc Tunadasso: " + orcTunadasso.getSaude());
		System.out.println("Orc Tunadasso  Atacando com " + orcTunadasso.atacar() + " de for�a");
		orcTunadasso.defender(10);
		System.out.println("Vida do Orc Tunadasso ap�s defender ataque: " + orcTunadasso.getSaude());

		System.out.println("===============================================================================");
	}
}
