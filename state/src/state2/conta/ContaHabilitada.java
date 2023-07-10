package state2.conta;

public class ContaHabilitada extends ContaEstado {

	public ContaHabilitada(Conta conta) {
		super(conta);
	}
		
	@Override
	public String toString() {
		return "ContaHabilitada";
	}

	@Override
	protected void proxEstado() {
		
		if(conta.getSaldo() <= -1000) {
			conta.setEstado(new ContaBloqueada(conta));
		}
		else if(conta.getSaldo() < 0 && conta.getSaldo() > -1000) {
			conta.setEstado(new ContaNegativa(conta));
		}
	}

}
