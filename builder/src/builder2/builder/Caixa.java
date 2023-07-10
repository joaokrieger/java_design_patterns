package builder2.builder;

import builder2.produto.Boleto;

public class Caixa extends Banco{

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
	public void construirCedente(String cedente) {
		super.construirCedente(cedente.toUpperCase());
	}

}
