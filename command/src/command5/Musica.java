package command5;

public class Musica {

	private String nome;
	private int tamanho;
	private int tempo;
	private float preco;
	
	public Musica(String nome, int tamanho, int tempo, float preco) {
		this.nome = nome;
		this.tamanho = tamanho;
		this.tempo = tempo;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}
	
	public int getTamanho() {
		return tamanho;
	}

	public int getTempo() {
		return tempo;
	}

	public float getPreco() {
		return preco;
	}
	
	@Override
	public String toString() {
		return nome + " " + tamanho + " MB " + tempo + " seg";
	}
	
	
	
}
