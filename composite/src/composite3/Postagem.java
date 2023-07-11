package composite3;

import java.util.ArrayList;
import java.util.List;

public class Postagem extends ComponenteSite{

	List<ComponenteSite> componentes = new ArrayList<>();
	
	public Postagem(String titulo, String url) {
		this.titulo = titulo;
		this.url = url;
	}
	
	public void add(ComponenteSite componente) {
		componentes.add(componente);
	}
	
	public void remove(ComponenteSite componente) {
		componentes.remove(componente);
	}
	
	@Override
	public void imprimir() {	
		
		System.out.println("[<"+this.titulo+"><"+this.url+">]");
		
		for(ComponenteSite componente:componentes) {
			componente.imprimir();
		}
	}

}
