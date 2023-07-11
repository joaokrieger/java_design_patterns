package composite3;

public class Pagina extends ComponenteSite{

	
	private String conteudo;

	public Pagina(String titulo, String url, String conteudo) {
		this.titulo = titulo;
		this.url = url;
		this.conteudo = conteudo;
	}
	
	@Override
	public void imprimir() {
		System.out.println("<"+this.titulo+"><"+this.url+"><"+this.conteudo+">");
	}

}
