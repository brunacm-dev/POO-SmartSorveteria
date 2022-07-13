package sorveteria;

public class ContaSS {
	
	private double saldo = 100;
	private int agencia;
	private int numero;

// transaçoes financeiras
	
	public void recebe(double valor) {
		this.saldo += valor;
	}

// metodos get set
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	
}