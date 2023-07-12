package decorator2.decorator;

import decorator2.PedidoBase;

public class FreteDecorator extends PedidoDecorator{

	private String tipo;

	public FreteDecorator(PedidoBase pedido, String tipo) {
		super(pedido);
		this.tipo = tipo;
	}
	
	@Override
	public double getTotal() {
		
		if(tipo == "Correio")
			return super.getTotal() + 40;
		else
			return super.getTotal() + 30;
	}
	
}
