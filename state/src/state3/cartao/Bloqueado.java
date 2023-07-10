package state3.cartao;

public class Bloqueado extends CartaoEstado{

	private Cartao cartao;

	public Bloqueado(Cartao cartao) {
		this.cartao = cartao;
	}
	
	@Override
	public void entrarPin(String pin) throws Exception {
		throw new Exception("Cart�o Bloqueado!");
	}

	@Override
	public void fazerPagamento() throws Exception {
		throw new Exception("Cart�o Bloqueado!");
	}
	
	@Override
	public String toString() {
		return "Bloqueado";
	}

}
