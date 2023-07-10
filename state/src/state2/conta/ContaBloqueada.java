package state2.conta;

public class ContaBloqueada extends ContaEstado {

	public ContaBloqueada(Conta conta) {
		super(conta);
	}

	@Override
	public String toString() {
		return "ContaBloqueada";
	}
	
	@Override
	protected void doSaque(double valor) throws Exception {
		throw new Exception("Conta bloqueada, n\u00E3o \u00E9 poss\u00EDvel fazer saque");
	}

	@Override
	protected void proxEstado() {
		if(conta.getSaldo() >= 0) {
			conta.setEstado(new ContaHabilitada(conta));
		}
		else if(conta.getSaldo() < 0 && conta.getSaldo() > -1000) {
			conta.setEstado(new ContaNegativa(conta));
		}
	}

}
