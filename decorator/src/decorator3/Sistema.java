package decorator3;

public class Sistema {

	public static void main(String[] args) {

		Texto texto = new TextoSimples("Teste do Decorator");
		System.out.println(texto);
		
		Maiusculas maiusculas = new Maiusculas(texto);
		System.out.println(maiusculas);

		Sublinhador sublinhador = new Sublinhador(maiusculas);
		System.out.println(sublinhador);
		
		Inversor inversor = new Inversor(maiusculas);
		System.out.println(inversor.getTexto());
		
		Cripto cripto = new Cripto(texto);
		System.out.println(cripto.getTexto());
	}

}
