package testes;

import cliente.CartaoSS;
import cliente.Cliente;

public class TesteCliente {

	public static void main(String[] args) {

		// cadastro de cliente

		System.out.println("#############################");
		System.out.println("Digite seus Dados para cadastro: ");
		System.out.println("#############################");

		Cliente c1 = new Cliente("A", 30.00);
		Cliente c2 = new Cliente("b", 40.00);

		System.out.println("total de clientes -- " + Cliente.getTotalClientes());

		CartaoSS novoCa = new CartaoSS(5400, 2143);
		
		// recebe cartao

	}

}
