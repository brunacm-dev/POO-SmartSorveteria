package cliente;

import sorveteria.ContaSS;

public class CartaoSS {
	private int loginSS;
	private int senhaSS;
	protected Cliente titular;
	private double cartaoSaldo;
	
// transaçoes financeiras
	
	public boolean transfere(double valor, ContaSS destino) {
		if (this.cartaoSaldo >= valor) {
			this.cartaoSaldo -= valor;
			destino.recebe(valor);
			System.out.println("Transferencia bem sucedida");
			return true;
		} else {
			System.out.println("Nao tem dinheiro suficiente para retirar");
			return false;
		}
	}
		
	public void recebe(double valor) {
		this.cartaoSaldo += valor;
	}

	
// construtor  REFAZER RESTTRICAO PRA NUMEROS IGUAIS
	
	public CartaoSS(int loginSS, int senhaSS) {
		if (loginSS >= 1000 && loginSS <= 9000) {
			if (senhaSS >= 1000 && senhaSS <= 9000) {
				this.loginSS = loginSS;
				this.senhaSS = senhaSS;
				System.out.println("Cartao Ativo n: " + this.loginSS);
			} else {
				System.out.println("Cartao Inativo");
			}
		} else {
			System.out.println("Cartao Inativo");
		}
	}

	// metodos get set

	public double getCartaoSaldo() {
		return cartaoSaldo;
	}

	public void setCartaoSaldo(double cartaoSaldo) {
		this.cartaoSaldo = cartaoSaldo;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

// autenticacao

	public boolean verificaLogin(int loginSS) {
		if (this.loginSS == loginSS) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verificaSenha(int senhaSS) {
		if (this.senhaSS == senhaSS) {
			return true;
		} else {
			return false;
		}
	}

	
}