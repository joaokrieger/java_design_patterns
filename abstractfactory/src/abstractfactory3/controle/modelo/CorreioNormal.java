package abstractfactory3.controle.modelo;

import java.util.HashMap;
import java.util.Map;

public class CorreioNormal extends Encomenda{

	@Override
	public double getPreco() throws Exception {
		
		if(getCubagem() < 0) {
			throw new Exception("A cubagem precisa ser maior que zero!");
		}
		else {
	        Map<String, Double> precosDestinos = new HashMap<>();
	        
	        precosDestinos.put("NORTE", 0.03);
	        precosDestinos.put("CENTROOESTE", 0.04);
	        precosDestinos.put("NORDESTE", 0.02);
	        precosDestinos.put("SUDESTE", 0.01);
	        precosDestinos.put("SUL", 0.01);
	        precosDestinos.put("AMERICALATINA", 0.07);
	        precosDestinos.put("AMERICADONORTE", 0.10);
	        precosDestinos.put("EUROPA", 0.15);
	        precosDestinos.put("AFRICA", 0.25);
	        precosDestinos.put("ASIA", 0.17);
	        precosDestinos.put("OCEANIA", 0.30);
	        
			return precosDestinos.getOrDefault(getDestino().toString(), 0.0);
		}
	}
}
