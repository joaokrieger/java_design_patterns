package decorator5;

import java.util.Random;

public class OrcBasico implements Orc {

	public OrcBasico() {
		setSaude(100);
	}
	
	private static Random sorteio = new Random();
	
	private int saude;

	@Override
	public int getSaude() {
		return saude;
	}
	
	@Override
	public void setSaude(int saude) {
		this.saude = saude;
	}
	
	@Override
	public int atacar() {
		return sorteio.nextInt(5);
	}
	
	@Override
	public void defender(int ataque) {
		int porrada = ataque - sorteio.nextInt(2);
		if (porrada > 0)
			saude -= porrada;
	}
	
}
