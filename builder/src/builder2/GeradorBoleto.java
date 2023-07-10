package builder2;

import builder2.builder.Banco;

// Director
public class GeradorBoleto {

	private Banco banco;
	
	public GeradorBoleto(Banco banco) {
		this.banco = banco;
	}
	
	public void construir(String cedente, String carteira, String nossoNumero) {
		banco.reset();
		banco.construirCedente(cedente);
		banco.construirCarteira(carteira);
		banco.construirNossoNumero(nossoNumero);
	}

}
