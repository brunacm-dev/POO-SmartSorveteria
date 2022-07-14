package conta;
import cliente.Cliente;


public class Conta {
	protected double saldo = 10.00;
	protected int agencia;
	protected int numero;
	protected Cliente titular;
	
	
	public void imprimeConta() {
		System.out.println("---------Conta:----------");
		System.out.println("Cliente: " + this.titular.getNome());
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero: " + this.numero);	
	}
	
	
	public void recebe(double valor) {
		this.saldo += valor;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.recebe(valor);
			System.out.println("Transferencia bem sucedida");
			return true;
		} else {
			System.out.println("Nao tem dinheiro suficiente para retirar");
			return false;
		}		
	}
	
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
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
	
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
