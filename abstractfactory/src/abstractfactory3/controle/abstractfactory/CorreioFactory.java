package abstractfactory3.controle.abstractfactory;

import abstractfactory3.controle.modelo.CorreioExpresso;
import abstractfactory3.controle.modelo.CorreioNormal;
import abstractfactory3.controle.modelo.Encomenda;

public class CorreioFactory extends AbstractFreteFactory {

	@Override
	public Encomenda prepararEncomendaExpresso() throws Exception {
		return new CorreioExpresso();
	}

	@Override
	public Encomenda prepararEncomendaNormal() throws Exception {
		return new CorreioNormal();
	}

}
