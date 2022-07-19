package arquivos;

import java.io.*;
import java.util.ArrayList;

import cliente.*;
import sorveteria.Sorveteria;


public class Escrita {

	public static void main(String[] args) throws IOException {
		
		Sorveteria s = new Sorveteria("Showverte", 2);
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		
		
		
		ArrayList <Cliente> clientes = new ArrayList <Cliente>();
		clientes.add(c1);
		clientes.add(c2);
		
		
		s.entrada(c1);
		s.entrada(c2);
		
			
		
		OutputStream file_out = new FileOutputStream("clientesCadastrados.txt");
		Writer e = new OutputStreamWriter(file_out);
		BufferedWriter buf_e = new BufferedWriter(e);
		
		buf_e.write(c1.getNome());
		buf_e.newLine();
		buf_e.write(c2.getNome());
		buf_e.newLine();
		buf_e.close();

	}

}
