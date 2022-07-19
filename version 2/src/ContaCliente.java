
public class ContaCliente extends Conta {
	
	
	@Override
	public void recebe(double valor) {
		super.saldo += valor;
	}
	
	@Override
	public boolean transfere(double valor, Conta destino) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			destino.recebe(valor);
			imprimeTransfSim();
			return true;
		} else {
			imprimeTransfNao();
			return false;
		}
	}
	
	public void saldoAtual(double valor) {
		
	}

}
