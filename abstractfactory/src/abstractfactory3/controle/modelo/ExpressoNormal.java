package abstractfactory3.controle.modelo;

import abstractfactory3.controle.abstractfactory.Destino;

public class ExpressoNormal extends Encomenda{
	
	@Override
	public double getPreco() throws Exception {
		
		if(getPeso() < 0 || getCubagem() < 0) {
			throw new Exception("Peso e Cubagem precisam ser maiores que zero!");
		}
		else {
			
			setDestino(Destino.AMERICADONORTE);
			
			double fatModificacao = 1;
			
			if(getCubagem() <= 27000) {
				fatModificacao = 0.3;
			}else if(getCubagem() > 27000 && getCubagem() < 21600) {
				fatModificacao = 0.7;
			}
			
			return getCubagem() * 0.009 + getPeso() * fatModificacao * 0.005;
		}
	}

}
