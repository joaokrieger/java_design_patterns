package builder1_novaversao.builder;

import builder1_novaversao.builder.Carro.CarroBuilder;
import builder1_novaversao.builder.pecas.Motor1_0;
import builder1_novaversao.builder.pecas.MotorV8;
import builder1_novaversao.builder.pecas.Pneu18;
import builder1_novaversao.builder.pecas.PneuComum;

public class Cliente {

	public static void main(String[] args) {
		
		CarroBuilder cb = new CarroBuilder();
		cb.motor(new MotorV8()).pneus(new Pneu18(), new Pneu18(), new Pneu18(), new Pneu18());
		
		Carro carro = cb.build();
		System.out.println(carro);
		
		// Por ora vamos usar dessa forma o novo Builder... mais tarde vamos
		// --- conhecer outro padrao GoF para resolver com esse novo Builder
		  
		cb.reset();
		cb.motor(new Motor1_0())
		  .pneus(new PneuComum(), new PneuComum(), 
				 new PneuComum(), new PneuComum());
		
		Carro carro2 = cb.build();
		System.out.println(carro2);

	}

}
