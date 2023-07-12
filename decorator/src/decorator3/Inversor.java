package decorator3;

public class Inversor extends TextoDecorator{

	public Inversor(Texto texto) {
		super(texto);
	}
	
	@Override
	public String getTexto() {
		StringBuilder sb = new StringBuilder(super.getTexto());
		sb.reverse();
		return sb.toString();
	}

}
