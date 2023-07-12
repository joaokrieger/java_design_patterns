package decorator2;

import decorator2.decorator.FreteDecorator;
import decorator2.decorator.MensagemDecorator;

public class Sistema {
	
	public static void main(String[] args) {
		
		PedidoBase pedido = new Pedido(150);
		System.out.println(pedido.getTotal());
		
		PedidoBase frete = new FreteDecorator(pedido, "Correio");
		System.out.println(frete.getTotal());
		
		PedidoBase expresso = new FreteDecorator(pedido, "Expresso");
		System.out.println(expresso.getTotal());
		
		PedidoBase mensagem = new MensagemDecorator(pedido, "4799998888");
		mensagem.concluir();
		
	}
}
