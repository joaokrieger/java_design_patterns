package decorator3;

public class Cripto extends TextoDecorator{

	public Cripto(Texto texto) {
		super(texto);
	}

	@Override
	public String getTexto() {
		
		char[] caracteres = super.getTexto().toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = (char) (caracteres[i] + 1);
        }

        return new String(caracteres);
	}
}
