package visitor5.visitor;

import visitor5.taxi.Cliente;
import visitor5.taxi.Taxi;

public class TaxiVisitor implements Visitor{

	private Cliente cliente;
	private boolean atendido;

	public TaxiVisitor(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public void Visit(Taxi taxi) {
		if(!taxi.isOcupado() && taxi.getPontoTaxi() == cliente.getPontoProximo()) {
			taxi.atender(cliente);
			this.atendido = true;
		}
	}
	
	public boolean getAtendido(){
		return this.atendido;
	}
}
