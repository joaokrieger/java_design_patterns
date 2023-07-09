package abstractfactory1.dao.xmlfactory;

import abstractfactory1.dao.abstractfactory.ClienteDados;
import abstractfactory1.dao.abstractfactory.DadosFactory;
import abstractfactory1.dao.abstractfactory.PedidoDados;

public class DadosXML extends DadosFactory {

	@Override
	public ClienteDados createCliente() {
		return new ClienteXML();
	}

	@Override
	public PedidoDados createPedido() {
		return new PedidoXML();
	}

}
