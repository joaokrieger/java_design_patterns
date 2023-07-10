package state4.pedido;

public class EstadoSuspenso extends PedidoEstado {

	public EstadoSuspenso(Pedido pedido) {
		super(pedido);
	}
	
	@Override
	public void retomar() {
		pedido.setEstado(new EstadoAnalise(pedido));
	}
	
	@Override
	public void cancelar() {
		pedido.setEstado(new EstadoCancelado(pedido));
	}
	

}
