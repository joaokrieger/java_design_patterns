package observer3.dispositivos;

import observer3.observer.Observador;

public class DispositivoConsole implements Observador{

	@Override
	public void atualizandoTemperatura(double temperatura) {
		System.out.println("Temperatura: "+temperatura);
	}

	@Override
	public void atualizandoUmidade(double umidade) {
		System.out.println("Umidade: "+umidade);
	}
}
