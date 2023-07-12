package decorator2.decorator;

import decorator2.PedidoBase;

public abstract class PedidoDecorator implements PedidoBase {
	
	private PedidoBase pedido;

	public PedidoDecorator(PedidoBase pedido) {
		this.pedido = pedido;
	}

	@Override
	public void concluir() {
		this.pedido.concluir();
	}

	@Override
	public double getTotal() {
		return this.pedido.getTotal();
	}
	
}
