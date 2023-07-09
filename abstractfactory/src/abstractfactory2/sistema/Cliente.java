package abstractfactory2.sistema;

import abstractfactory2.abstractFactory.CarroPopular;
import abstractfactory2.abstractFactory.CarroSedan;
import abstractfactory2.abstractFactory.FabricaDeCarro;
import abstractfactory2.fiat.FabricaFiat;
import abstractfactory2.ford.FabricaFord;

public class Cliente {
	
	public static void main(String[] args) {
		
		FabricaDeCarro fabrica = new FabricaFord();
		criarSedan(fabrica);
		criarPopular(fabrica);

		FabricaDeCarro fabrica2 = new FabricaFiat();
		criarSedan(fabrica2);
		criarPopular(fabrica2);
	}

	private static void criarPopular(FabricaDeCarro fabrica) {
		CarroPopular popular = fabrica.criarCarroPopular();
		popular.exibirInfoPopular();
		System.out.println();
		
	}

	private static void criarSedan(FabricaDeCarro fabrica) {

		CarroSedan sedan = fabrica.criarCarroSedan();
		sedan.exibirInfoSedan();
		System.out.println();
		
	}
}
