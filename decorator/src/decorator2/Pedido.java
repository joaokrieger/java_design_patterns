package decorator2;

public class Pedido implements PedidoBase{

	private double total;
	private String estado;

	public Pedido(double total) {
		this.total = total;
		this.estado = "Aberto";
	}
	
	@Override
	public void concluir() {
		this.estado = "Concluido";
	}
	
	@Override
	public double getTotal() {
		return this.total;
	}

}
