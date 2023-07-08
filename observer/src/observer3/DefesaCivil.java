package observer3;

import observer3.dispositivos.DispositivoConsole;
import observer3.dispositivos.DispositivoWindow;
import observer3.estacao.EstacaoMeteorologica;
import observer3.sensores.SensorTemperatura;
import observer3.sensores.SensorUmidade;

public class DefesaCivil {

	public void abrir () {
		
		EstacaoMeteorologica estacao = new EstacaoMeteorologica();
		estacao.setSensorTemp(new SensorTemperatura());
		estacao.setSensorUmidade(new SensorUmidade());
		
		DispositivoConsole console = new DispositivoConsole();
		DispositivoWindow window = new DispositivoWindow();
	
		estacao.anexar(console);
		estacao.anexar(window);
		
		estacao.ligar();
	}
	
	public static void main(String[] args) throws InterruptedException {

		DefesaCivil dc = new DefesaCivil();
		dc.abrir();
		
		while (true) {
			Thread.sleep(2000);
		}
	}
}
