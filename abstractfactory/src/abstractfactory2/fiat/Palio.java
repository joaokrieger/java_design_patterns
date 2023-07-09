package abstractfactory2.fiat;

import abstractfactory2.abstractFactory.CarroPopular;

public class Palio implements CarroPopular{

	@Override
	public void exibirInfoPopular() {
		System.out.println("Modelo: Palio\nFábrica: Fiat\nCategoria:Popular");
	}

}
