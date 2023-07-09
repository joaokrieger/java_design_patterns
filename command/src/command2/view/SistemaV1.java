package command2.view;
import java.util.Scanner;

import command2.command.AdicionarEstoque;
import command2.command.CommandInvoker;
import command2.command.RemoverEstoque;
import command2.controle.Deposito;

public class SistemaV1 {

	public static void main(String[] args) throws Exception {

		CommandInvoker ci = new CommandInvoker();
		Deposito deposito = new Deposito();
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("Deposito : " + deposito.getQuantidade());
			System.out.println("Digite a opcao (1-Adicionar; 2-Remover; 3-Desfazer comando; 4-Refazer comando; 5-Sair)");
			
			int op = s.nextInt();
			if (op == 5) 
				return;
			
			switch (op) {
				case 3: 
				    ci.undo();
			  		break;
			  
				case 4: 
				    ci.redo();
					break;

				default: 
					
					System.out.println("Digite a quantidade");
					int qtdade = s.nextInt();
				
					if (op == 1) {
						ci.add(new AdicionarEstoque(deposito, qtdade));
					} else {
						ci.add(new RemoverEstoque(deposito, qtdade));
					}
					
					ci.execute();
			}
		} while (true);
	}
	
}
