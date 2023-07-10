package state4.pedido;

public class EstadoRegistrado extends PedidoEstado {

	public EstadoRegistrado(Pedido pedido) {
		super(pedido);
	}
	
	@Override
	public void analisar() {
		pedido.setEstado(new EstadoAnalise(pedido));
	}

}
