package visitor5.taxi;

import java.util.ArrayList;
import java.util.List;

import visitor5.visitor.TaxiVisitor;

public class Frota {
	
	private List<Taxi> taxis = new ArrayList<>();
	
	public void add(Taxi tx) {
		taxis.add(tx);
	}
	
	public void accept(TaxiVisitor visitor) {
		for(Taxi tx:taxis) {
			tx.accept(visitor);
			
			if(visitor.getAtendido()) {
				break;
			}
		}
	}
	
}
