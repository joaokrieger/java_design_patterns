package decorator4;

import decorator4.modelo.Sanduiche;
import decorator4.modelo.SanduicheAberto;
import decorator4.modelo.SanduicheFechado;
import decorator4.decorator.Hamburguer;
import decorator4.decorator.Pao;
import decorator4.decorator.Queijo;

public class Sistema {

	public static void main(String[] args) {
		
		Sanduiche sanduiche = new SanduicheFechado();
		System.out.println(sanduiche); // Imprime (Tudo dentro da caixa)
		System.out.println(sanduiche.getPreco()); // Imprime 1.0
		
		
		Sanduiche paoComPao = new Pao(new Pao(sanduiche));
		System.out.println(paoComPao); // Imprime Pao Pao (Tudo dentro da caixa)
		System.out.println(paoComPao.getPreco()); // Imprime 2.0
		
		
		Sanduiche paoComHamburguer = new Pao(new Hamburguer(new Pao(sanduiche)));
		System.out.println(paoComHamburguer); // Imprime Pao Hamburguer Pao (Tudo dentro da caixa)
		System.out.println(paoComHamburguer.getPreco()); // Imprime 4.0
		
	
		Sanduiche xSuperBurguer = new Pao(new Queijo(new Hamburguer(new Queijo(new Pao(sanduiche)))));
		System.out.println(xSuperBurguer); // Pao Queijo Hamburguer Queijo Pao (Tudo dentro da caixa)
		System.out.println(xSuperBurguer.getPreco()); // 5.5
		
		Sanduiche xSuperBurguerNoPrato = new Pao(new Queijo(new Hamburguer(new Queijo(new Pao(new SanduicheAberto())))));
		System.out.println(xSuperBurguerNoPrato); // Pao Queijo Hamburguer Queijo Pao (Tudo colocado no prato)
		System.out.println(xSuperBurguerNoPrato.getPreco()); // 7.5
	}

}
