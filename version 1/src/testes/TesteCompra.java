package testes;

import controle.ControleDePreco;
import sorveteria.Sorvete;
import sorveteria.SorveteCasquinha;
import sorveteria.SorvetePicole;

public class TesteCompra {

	public static void main(String[] args) {

		// polimorfismo EM CONSTRUCAO
	
	
	Sorvete abacaxi = new SorvetePicole();
	abacaxi.setCategoria(1);
	System.out.println("Valor do Sorvete picole 1 " + abacaxi.getPreco());
	
	Sorvete morango = new SorveteCasquinha();
	morango.setCategoria(3);
	System.out.println("Valor do Sorvete casquinha 1 " + morango.getPreco());
	
	ControleDePreco controle = new ControleDePreco();
	controle.precifica(morango);
	System.out.println("Valor do Sorvete casquinha " + controle.getPrecoCont());
	
	controle.precifica(abacaxi);
	System.out.println("Valor do Sorvete picole " + controle.getPrecoCont());
	controle.precifica(morango);
	System.out.println("Valor do Sorvete casquinha " + controle.getPrecoCont());

}
