package abstractfactory3.controle.abstractfactory;

import abstractfactory3.controle.modelo.Encomenda;

public abstract class AbstractFreteFactory {
	
	public abstract Encomenda prepararEncomendaExpresso() throws Exception;
	public abstract Encomenda prepararEncomendaNormal() throws Exception;
	
}
