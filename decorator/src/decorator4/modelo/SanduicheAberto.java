package decorator4.modelo;

public class SanduicheAberto implements Sanduiche{

	@Override
	public double getPreco() {
		return 3;
	}
	
	@Override
	public String toString() {
		return "(Sanduiche Aberto)";
	}

}
