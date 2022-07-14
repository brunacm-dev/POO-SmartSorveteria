import cliente.CartaoSS;
import cliente.Cliente;
import conta.Conta;

public class Teste {

	public static void main(String[] args) {
		
		Cliente fulano = new Cliente();
		fulano.setNome("fulano");
		
		Cliente sorveteria = new Cliente();
		sorveteria.setNome("sorveteria");
		
		Conta s1 = new Conta();
		s1.setTitular(sorveteria);
		
		Conta c1 = new Conta();
		c1.setTitular(fulano);
		c1.setSaldo(40.00);
	
		
		CartaoSS a = new CartaoSS();
		a.setLogin(1234);
		a.setTitular(fulano);
		
		
		c1.transfere(10.00, s1);
		c1.imprimeConta();
		s1.imprimeConta();
		a.imprimeCartaoSS();
		

}
}