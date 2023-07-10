package state4.pedido;

public abstract class PedidoEstado {

	protected Pedido pedido;
	
	public PedidoEstado(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public void analisar(){};
	public void suspender(){};
	public void retomar(){};
	public void cancelar(){};
	public void aprovar(){}
	public void atender() {};
}
