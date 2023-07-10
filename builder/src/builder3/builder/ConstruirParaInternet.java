package builder3.builder;

import builder3.produto.Pessoa;

public class ConstruirParaInternet extends ConstruirPessoa{

	@Override
	public void construirNome(String nome) {
		getPessoa().setNome(nome);
	}
	
	@Override
	public void construirEmail(String email) {
		getPessoa().setEmail(email);
	}
	
	@Override
	public void construirEndereco(String endereco) {}
	
	@Override
	public void construirTelefone(String telefone) {}
	
	@Override
	public void reset() {
		this.pessoa = new Pessoa();
	}

}
