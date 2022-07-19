
public class ContaSorveteria extends Conta {
	
	
	
	
	@Override
	public void recebe(double valor) {
		super.saldo += valor;
	}
	
	
}


