package abstractfactory2.fiat;

import abstractfactory2.abstractFactory.CarroSedan;

public class PalioSedan implements CarroSedan {

	@Override
	public void exibirInfoSedan() {
		System.out.println("Modelo: Palio\nFábrica:Fiat\nCategoria:Sedan");
	}

	private int bagagem;
	
	@Override
	public void colocarBagagem(int kg) throws Exception {
		if(this.bagagem + kg <= 400) {
			this.bagagem += kg;
		}
	}

	@Override
	public int getKgBagageiro() {
		return bagagem - 100;
	}
}
