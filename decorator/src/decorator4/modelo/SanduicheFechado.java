package decorator4.modelo;

public class SanduicheFechado implements Sanduiche {

	@Override
	public double getPreco() {
		return 1;
	}
	
	@Override
	public String toString() {
		return "(Tudo dentro da caixa)";
	}
}
