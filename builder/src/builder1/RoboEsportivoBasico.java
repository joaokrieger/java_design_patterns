package builder1;

import builder1.builder.MotorV8;
import builder1.builder.PneuComum;
import builder1.builder.Robo;

public class RoboEsportivoBasico extends Robo {

	@Override
	public void construirMotor() {
		carro.setMotor(new MotorV8());
	}
	
	@Override
	public void construirPneus() {
		carro.setPneus(new PneuComum(), new PneuComum(), new PneuComum(), new PneuComum());
	}
	
}
