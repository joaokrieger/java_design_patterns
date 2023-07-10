package builder2;

import builder2.builder.Bradesco;
import builder2.builder.Caixa;

public class Cliente {

	public static void main(String[] args) {

		// Bradesco
		Bradesco builder = new Bradesco();
		GeradorBoleto gerador1 = new GeradorBoleto(builder);
		gerador1.construir("Bino", "001", "01010101");
		System.out.println(builder.getBoleto());
		
		// Caixa
		Caixa builder2 = new Caixa();
		GeradorBoleto gerador2 = new GeradorBoleto(builder2);
		gerador2.construir("Bino", "001", "01010101");
		System.out.println(builder2.getBoleto());
		
		// Terceiro teste: NovoBoleto 
	}

}
