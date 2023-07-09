package command3.sistema;

import command3.observer.Observer;

public class ConsoleObserver implements Observer {

	@Override
	public void buscouDados(String[][] dados) {
		for (String[] umDados: dados) {
			System.out.println(umDados[0] + " " + umDados[1]);
		}
	}

	@Override
	public void deletouPessoa(int codigo) {
		System.out.println("Pessoa com o ID: "+codigo+" foi deletada com sucesso!");
	}

	@Override
	public void adicionouPessoa(String nome) {
		System.out.println("Pessoa: "+nome+" adicionada com sucesso!");
	}

}
