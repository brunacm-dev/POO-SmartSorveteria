package arquivos;

import java.io.*;

import avaliacao.AvaliacaoOO2022;
import cliente.Cliente;

public class ControleArquivos {
	
	private AvaliacaoOO2022 avaliacao;

	
	
public void  salvarEmArquivo(AvaliacaoOO2022 avaliacao) throws FileNotFoundException {
		
		OutputStream file_out = new FileOutputStream("avaliacao.txt");
		Writer e = new OutputStreamWriter(file_out);
		BufferedWriter buf_e = new BufferedWriter(e);
		
		String nome = avaliacao.getNome();
		int mat = avaliacao.getMatricula();
		int nota = avaliacao.getNota();
		
		try {
			buf_e.write(nome);
			buf_e.newLine();
			buf_e.write(mat);
			buf_e.newLine();
			buf_e.write(nota);
			buf_e.newLine();
			buf_e.close();
		} catch (IOException ex) {
			System.out.println("IOException or FileNotFoundException");
		}
		
		
	}

	public void lerArquivoClientes() {

		FileInputStream file_in;
		try {
			file_in = new FileInputStream("clientesCadastrados.txt");
			InputStreamReader l = new InputStreamReader(file_in);
			BufferedReader buf_l = new BufferedReader(l);
			String lerNome = buf_l.readLine();
			System.out.println(lerNome);
			buf_l.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void escreverArquivoCliente(Cliente pessoa) throws FileNotFoundException, IOException {

		OutputStream file_out = new FileOutputStream("clientesCadastrados.txt");
		Writer e = new OutputStreamWriter(file_out);
		BufferedWriter buf_e = new BufferedWriter(e);

		String escrever = pessoa.getNome();
		buf_e.write(escrever);
		buf_e.newLine();
		buf_e.close();
	}

	public AvaliacaoOO2022 getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(AvaliacaoOO2022 avaliacao) {
		this.avaliacao = avaliacao;
	}

}
