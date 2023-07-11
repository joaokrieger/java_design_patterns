package visitor5;

import visitor5.taxi.Cliente;
import visitor5.taxi.Frota;
import visitor5.taxi.Taxi;
import visitor5.visitor.TaxiVisitor;

public class Sistema {

	public static void main(String[] args) {
		
		Frota frota = new Frota();
		frota.add(new Taxi(100, 1));
		frota.add(new Taxi(101, 2));
		frota.add(new Taxi(102, 2));
		frota.add(new Taxi(103, 1));
		frota.add(new Taxi(104, 3));
	
		testarAtendimento(new Cliente(1, "91234"), frota);
		testarAtendimento(new Cliente(2, "95678"), frota);
		testarAtendimento(new Cliente(4, "90000"), frota);
		testarAtendimento(new Cliente(1, "92468"), frota);
		testarAtendimento(new Cliente(1, "90001"), frota);
	}
	
	private static void testarAtendimento(Cliente cliente, Frota frota) {
		TaxiVisitor visitor = new TaxiVisitor(cliente);
		
		frota.accept(visitor);
		
		if(!visitor.getAtendido())
			System.out.println("Atendimento ligou para cliente " + cliente.getNumeroTelefone() + " avisando que não tem taxi.");
	}
	
}
