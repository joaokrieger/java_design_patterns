package builder3.builder;

import builder3.produto.Pessoa;

public abstract class ConstruirPessoa {
	
	protected Pessoa pessoa;
	
	public void construirEmail(String email) {
		getPessoa().setEmail(email);
	}
	
	public void construirEndereco(String endereco) {
		getPessoa().setEndereco(endereco);
	}
	
	public void construirNome(String nome) {
		getPessoa().setNome(nome);
	}
	
	public void construirTelefone(String telefone) {
		getPessoa().setTelefone(telefone);
	}
	
	
	public Pessoa getPessoa() {
		return this.pessoa;
	}
	
	public abstract void reset();
}
