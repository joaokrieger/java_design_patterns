package command3.sistema;

import java.util.Scanner;

import command3.command.Command;
import command3.command.CommandFactory;
import command3.command.CommandInvoker;

public class Servidor {
	
	public static void main(String[] args) throws Exception {

		CommandInvoker ci = new CommandInvoker();
		CommandFactory factory = new CommandFactory(new ConsoleObserver());
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.print("Digite um comando (new, all, get, delete, undo, redo) : ");
			String scomm = s.next();
			if (scomm.equals("undo")) {
				ci.undo();
			} else {
			   if (scomm.equals("redo")) {
				   ci.redo();
			   } else {
				   String[] dados = null;
				   if (!scomm.equals("all")) {
					   System.out.print("Codigo: ");
					   dados = new String[2];
					   
					   dados[0] = s.next();
	
					   if (scomm.equals("new")) {
						   System.out.print("Nome: ");
						   dados[1] = s.next();
					   }
				   }
				   Command comm = factory.getCommand(scomm, dados);
				   ci.execute(comm);
					
			   }
			}
				
			
		} while (true);
		
	}
}
