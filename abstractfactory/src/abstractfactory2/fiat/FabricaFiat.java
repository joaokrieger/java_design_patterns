package abstractfactory2.fiat;

import abstractfactory2.abstractFactory.CarroPopular;
import abstractfactory2.abstractFactory.CarroSedan;
import abstractfactory2.abstractFactory.FabricaDeCarro;

public class FabricaFiat extends FabricaDeCarro{

	@Override
	public CarroSedan criarCarroSedan() {
		return new PalioSedan();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		return new Palio();
	}

}
