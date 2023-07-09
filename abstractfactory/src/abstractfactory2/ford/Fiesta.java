package abstractfactory2.ford;

import abstractfactory2.abstractFactory.CarroPopular;

public class Fiesta implements CarroPopular {

	@Override
	public void exibirInfoPopular() {
		System.out.println("Modelo: Fiesta\nFábrica: Ford\nCategoria:Popular");
	}

}
