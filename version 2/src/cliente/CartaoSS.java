package cliente;

import conta.ContaCliente;

public class CartaoSS {
	private int login;
	private int senha;
	private Cliente titular;
	private ContaCliente saldo;
	

	public void imprimeCartaoSS() {
		System.out.println("---------Cartao:----------");
		System.out.println("Cliente: " + this.titular.getNome());
		System.out.println("CartaoSS: " + this.login);	
	
	}
	

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getLogin() {
		return login;
	}
	public void setLogin(int login) {
		this.login = login;
	}


	public ContaCliente getSaldo() {
		return saldo;
	}


	public void setSaldo(ContaCliente saldo) {
		this.saldo = saldo;
	}
	

}
