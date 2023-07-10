package builder2.builder;

import builder2.produto.Boleto;

public class Bradesco extends Banco{

	private Boleto boleto;

	@Override
	public Boleto getBoleto() {
		return this.boleto;
	}

	@Override
	public void reset() {
		this.boleto = new Boleto();
	}
	
	@Override
	public void construirCarteira(String carteira) {
		super.construirCarteira("06");
	}

}
