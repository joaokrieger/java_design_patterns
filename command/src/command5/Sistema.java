package command5;

import java.util.Scanner;

import command5.observer.ConsoleObserver;
import command5.command.AllCommand;
import command5.command.CommandInvoker;
import command5.command.NewCommand;
import command5.command.PrecoCommand;
import command5.command.TamanhoCommand;
import command5.observer.Observer;

public class Sistema {

	public static void main(String[] args) {
		
		Musica m1 = new Musica("AAahhhh", 15430, 15, 13.2f);
		Musica m2 = new Musica("Vai moleque", 22311, 72, 13.2f);
		Musica m3 = new Musica("Louca da caixa d'agua", 35723, 84, 13.2f);
		
		BancoMusicas.getInstancia().add(m1);
		BancoMusicas.getInstancia().add(m2);
		BancoMusicas.getInstancia().add(m3);
		
		CarrinhoCompras cc = new CarrinhoCompras();

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Menu");
			System.out.println("1-Adicionar no carrinho");
			System.out.println("2-Listar carrinho");
			System.out.println("3-Tamanho das m\u00FAsicas");
			System.out.println("4-Pre\u00E7o total");
			
			ConsoleObserver co = new ConsoleObserver();
			CommandInvoker ci = new CommandInvoker();
			
			int op = sc.nextInt();
			switch (op) {
			    case 1: // adicionar no carrinho
		    		
			    	System.out.println("Escolha a m\u00FAsica (1 a 3)");
		    		int opMusica = sc.nextInt() - 1;
		    		Musica m = BancoMusicas.getInstancia().getMusicas().get(opMusica);
		    		
		    		ci.execute(new NewCommand(co,cc,m));

		    		break;
			    		
			    case 2:	// listar carrinho 
			    	
		    		ci.execute(new AllCommand(co,cc));
		    		
		    		break;
			    		
			    case 3: // tamanho das musicas
		    		
		    		ci.execute(new TamanhoCommand(co,cc));
		    		
		    		break;
			    		
			    case 4: // preco total
		    		
		    		ci.execute(new PrecoCommand(co,cc));
		    		
		    		break;
			}
		}
	}

}
