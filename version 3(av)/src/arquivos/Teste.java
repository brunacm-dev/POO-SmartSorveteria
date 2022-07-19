package arquivos;
import java.io.*;

import cliente.Cliente;
import sorveteria.Sorveteria;



public class Teste {

	public static void main(String[] args) throws IOException {

		
		Sorveteria s = new Sorveteria("Showverte", 2);
		Cliente c1 = new Cliente();
		
		s.entrada(c1);
		
		
	
		}}
