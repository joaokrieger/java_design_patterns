package builder3.director;

import builder3.builder.ConstruirPessoa;

public class Director {

	private ConstruirPessoa contato;
	
	public Director(ConstruirPessoa contato) {
		this.contato = contato;
	}
	
	public void construir(String nome, String endereco, String email, String telefone) {
		
		contato.reset();
		
		contato.construirNome(nome);
		contato.construirEndereco(endereco);
		contato.construirEmail(email);
		contato.construirTelefone(telefone);
	}
}
