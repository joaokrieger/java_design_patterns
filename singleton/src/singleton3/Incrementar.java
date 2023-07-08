package singleton3;

public class Incrementar {

	private static Incrementar instance;
	private int contador = 0;
	
	private Incrementar() {}
	
	public static Incrementar getInstance() {
		
		if(instance == null) {
			instance = new Incrementar();
		}
		
		return instance;
	}
	
	public void inc() {
		contador++;
	}

	public int getConta() {
		return contador;
	}
	
}
