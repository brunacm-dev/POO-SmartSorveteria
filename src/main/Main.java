package main;

import cliente.CartaoSS;
import cliente.Cliente;
import sorveteria.ContaSS;

public class Main {

	public static void main(String[] args) {

		// incompleto, apenas testes

		// cadastro de cliente

		System.out.println("#############################");
		System.out.println("Digite seus Dados para cadastro: ");
		System.out.println("#############################");

		Cliente c1 = new Cliente("Bruna", 30.00);
		Cliente c2 = new Cliente("Bruno", 40.00);
		
		ContaSS contaSS = new ContaSS();
		System.out.println("Conta SS: " + contaSS.getSaldo());

		CartaoSS novoCa = new CartaoSS(5400, 2143);
		
		System.out.println("Cartao Cliente " + c1.getNome() + " " + c1.getSaldo());
		novoCa.transfere(20, contaSS);
		System.out.println("Conta SS: " + contaSS.getSaldo());

	

	}

}