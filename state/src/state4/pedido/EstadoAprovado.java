package state4.pedido;

public class EstadoAprovado extends PedidoEstado {

	public EstadoAprovado(Pedido pedido) {
		super(pedido);
	}
	
	@Override
	public void atender() {
		pedido.setEstado(new EstadoAtendido(pedido));
	}
	
	@Override
	public void cancelar() {
		pedido.setEstado(new EstadoCancelado(pedido));
	}

}
