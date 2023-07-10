package state4.pedido;

public class EstadoAnalise extends PedidoEstado {

	public EstadoAnalise(Pedido pedido) {
		super(pedido);
	}
	
	@Override
	public void aprovar() {
		pedido.setEstado(new EstadoAprovado(pedido));
	}
	
	@Override
	public void cancelar() {
		pedido.setEstado(new EstadoCancelado(pedido));
	}
	
	@Override
	public void suspender() {
		pedido.setEstado(new EstadoSuspenso(pedido));
	}

}
