package command5;

import java.util.ArrayList;
import java.util.List;

// singleton
public class BancoMusicas {

	private BancoMusicas() {} 
	
	private static BancoMusicas instancia;
	
	public static BancoMusicas getInstancia() {
		if (instancia == null)
			instancia = new BancoMusicas();
		
		return instancia;
	}
	
	private List<Musica> musicas = new ArrayList<>();
	
	public void add(Musica m) {
		this.musicas.add(m);
	}

	public List<Musica> getMusicas() {
		return this.musicas;
	}
}
