package visitor4;

import visitor4.personagens.Arqueiro;
import visitor4.personagens.Catapulta;
import visitor4.personagens.Lanceiro;
import visitor4.visitor.ArqueiroVisitor;

public class App {
	
	public static void main(String[] args) {
			
		Arqueiro arqueiro = new Arqueiro();
		Lanceiro lanceiro = new Lanceiro();
		Catapulta catapulta = new Catapulta();
		
		Exercito exercito = new Exercito();
		
		exercito.add(arqueiro);
		exercito.add(lanceiro);
		exercito.add(catapulta);
		
		ArqueiroVisitor visitor = new ArqueiroVisitor(catapulta);
		
		System.out.println("Arqueiro: "+arqueiro.getPontoVida());
		System.out.println("Lanceiro: "+lanceiro.getPontoVida());
		System.out.println("Catapulta: "+catapulta.getPontoVida());
		
		exercito.accept(visitor);
		
		System.out.println("Arqueiro: "+arqueiro.getPontoVida());
		System.out.println("Lanceiro: "+lanceiro.getPontoVida());
		System.out.println("Catapulta: "+catapulta.getPontoVida());
	}
}
