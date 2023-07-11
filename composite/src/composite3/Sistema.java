package composite3;

public class Sistema {
	
	public static void main(String[] args) {
		
		Pagina pag1 = new Pagina("Facebook", "www.facebook.com", "Conteúdo do Facebook");
		Pagina pag2 = new Pagina("Twitter", "www.twitter.com", "Conteúdo do Twitter");
		Pagina pag3 = new Pagina("Uol", "www.uol.com", "Conteúdo do Uol");
		Pagina pag4 = new Pagina("Globo", "www.globo.com", "Conteúdo da Globo");
		
		
		Postagem post = new Postagem("Sites", "www.sites.com");
		
		post.add(pag1);
		post.add(pag2);
		post.add(pag3);
		post.add(pag4);
		
		post.imprimir();
	}
}
