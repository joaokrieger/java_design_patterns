package abstractfactory3.controle.modelo;

import java.util.HashMap;
import java.util.Map;

public class CorreioExpresso extends Encomenda {

	@Override
	public double getPreco() throws Exception {
		
		if(getPeso() < 0) {
			throw new Exception("O peso precisa ser maior que zero!");
		}
		else {
			
			Map<String, Double> precosDestinos = new HashMap<>();
	        
	        precosDestinos.put("NORTE", getPeso() * 0.05);
	        precosDestinos.put("NORDESTE", getPeso() * 0.05);
	        precosDestinos.put("CENTROOESTE", getPeso() * 0.075);
	        precosDestinos.put("SUDESTE", getPeso() * 0.025);
	        precosDestinos.put("SUL",getPeso() * 0.025);

			return precosDestinos.getOrDefault(getDestino().toString(), 0.0);
		}
	}
}
