package decorator2.decorator;

import decorator2.PedidoBase;

public class MensagemDecorator extends PedidoDecorator{

	private String numero;

	public MensagemDecorator(PedidoBase pedido, String numero) {
		super(pedido);
		this.numero = numero;
	}
	
	@Override
	public void concluir() {
		super.concluir();
		
		System.out.println("Se comunicando com "+numero+" com o preço do pedido "+super.getTotal());
	}

}
