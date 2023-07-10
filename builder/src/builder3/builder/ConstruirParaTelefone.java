package builder3.builder;

import builder3.produto.Pessoa;

public class ConstruirParaTelefone extends ConstruirPessoa{


	@Override
	public void construirNome(String nome) {
		getPessoa().setNome(nome);
	}
	
	@Override
	public void construirTelefone(String telefone) {
		getPessoa().setTelefone(telefone);
	}
	
	@Override
	public void construirEmail(String email) {}
	
	@Override
	public void construirEndereco(String endereco) {}
	
	@Override
	public void reset() {
		this.pessoa = new Pessoa();
	}

}
