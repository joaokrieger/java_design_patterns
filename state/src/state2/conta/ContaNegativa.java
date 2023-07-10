package state2.conta;

public class ContaNegativa extends ContaEstado {

	public ContaNegativa(Conta conta) {
		super(conta);
	}

	@Override
	public String toString() {
		return "ContaNegativa";
	}
	
	@Override
	protected void doSaque(double valor) throws Exception {
		
		// na verdade a mensagem abaixo deveria ser resolvida com Observer
		System.out.println("Conta negativa, aten\u00E7\u00E3o para o saldo");

		super.doSaque(valor);

	}

	@Override
	protected void proxEstado() {
		
		if(conta.getSaldo() <= -1000) {
			conta.setEstado(new ContaBloqueada(conta));
		}
		else if(conta.getSaldo() >= 0) {
			conta.setEstado(new ContaHabilitada(conta));
		}
	}

}
