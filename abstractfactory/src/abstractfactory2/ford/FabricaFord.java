package abstractfactory2.ford;

import abstractfactory2.abstractFactory.CarroPopular;
import abstractfactory2.abstractFactory.CarroSedan;
import abstractfactory2.abstractFactory.FabricaDeCarro;

public class FabricaFord extends FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		return new FiestaSedan();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		return new Fiesta();
	}

}
