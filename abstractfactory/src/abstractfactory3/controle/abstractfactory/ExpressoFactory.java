package abstractfactory3.controle.abstractfactory;

import abstractfactory3.controle.modelo.Encomenda;
import abstractfactory3.controle.modelo.ExpressoNormal;

public class ExpressoFactory extends AbstractFreteFactory{

	@Override
	public Encomenda prepararEncomendaExpresso() throws Exception {
		throw new Exception("Modo não suportado de frete!");
	}

	@Override
	public Encomenda prepararEncomendaNormal() throws Exception {
		return new ExpressoNormal();
	}

}
