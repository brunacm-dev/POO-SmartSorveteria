package sorveteria;
import java.io.*;
import java.util.*;
import avaliacao.*;


import cliente.Cliente;

public class Sorveteria {
	private String nome;
	private boolean giraRoleta = false;
	private int numMaquina;
	private int total = 0;
	private int escolheBotao;
	private Cliente pessoa;
	
	
	
	public Sorveteria(String nome, int numMaquina){
		this.nome = nome;
		this.numMaquina = numMaquina;
		imprimeMsgInicial(numMaquina);		
	}
	
	
	public void entrada(Cliente pessoa) {
		Scanner input = new Scanner(System.in);
		imprimeControleEntrada();
		escolheBotao = input.nextInt();
		switch (escolheBotao) {
		case 0:
			imprimeMsgFinal();
			break;
		case 1:
			cadastraCliente(pessoa);
			total ++;
			giraRoleta = true;
			break;
		case 2:
			verificaCadastro(pessoa);
			break;
	}
	}
	
	
	public boolean verificaCadastro(Cliente pessoa) {
		Scanner input = new Scanner(System.in);
		imprimeControleId();
		int senha = input.nextInt();
		pessoa.getCartao().setSenha(senha);
		int num = pessoa.getCartao().getSenha();
		// refazer logica
		if (num == 1) {
			giraRoleta = true;
			return true;
		} else {
			imprimeMsgCadastro();
			escolheBotao = input.nextInt();
			switch (escolheBotao) {
			case 0:
				imprimeMsgFinal();
				break;
			case 1:
				cadastraCliente(pessoa);
				giraRoleta = true;
				break;
			}
			return false;
		}
	}
	
	
	public void cadastraCliente(Cliente pessoa) {
		Scanner input = new Scanner(System.in);
		imprimeNomeC();
		String cNome = input.nextLine();
		pessoa.setNome(cNome);
		imprimemesDeNiverC();
		int cMes = input.nextInt();
		pessoa.setMesDeNiver(cMes);
		imprimeIdadeC();
		int cIdade = input.nextInt();
		pessoa.setIdade(cIdade);
		imprimeCadastro();
		try {
		 escreverArquivoCliente(pessoa);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
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
	
	


	public void imprimeNomeC() {
		System.out.println("Digite seu Nome: ");
		
	}
	public void imprimeIdadeC() {
		System.out.println("Digite sua Idade: ");
		
	}
	public void imprimemesDeNiverC() {
		System.out.println("Digite o numero do seu Mes de Niver: ");
		
	}
	
	public void imprimeCadastro() {
		System.out.println("---------Cadastrando Cliente----------");

	}
	
	public void imprimeControleEntrada() {
		System.out.println("Para Entrar Digite 2, Para se Cadastrar Digite 1, Para Sair Digite 0");
	}
	
	public void imprimeControleId() {
		System.out.println("Digite sua senha de cadastro do CartaoS: ");
	}
	
	public void imprimeMsgInicial(int num) {
		System.out.println("---------Boas Vindas:----------");
		System.out.println("Maquina n: " + num);
	}
	
	public void imprimeMsgFinal() {
		System.out.println("---------Obrigada por ter vindo, Até logo!----------");
	}
	
	public void imprimeMsgCadastro() {
		System.out.println("---------Infos:----------");
		System.out.println("Cliente não Cadastrado");
		System.out.println("Para se Cadastrar Digite 1, Para Sair Digite 0");
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isGiraRoleta() {
		return giraRoleta;
	}
	public void setGiraRoleta(boolean giraRoleta) {
		this.giraRoleta = giraRoleta;
	}
	public int getNumMaquina() {
		return numMaquina;
	}
	public void setNumMaquina(int numMaquina) {
		this.numMaquina = numMaquina;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getEscolheBotao() {
		return escolheBotao;
	}

	public void setEscolheBotao(int escolheBotao) {
		this.escolheBotao = escolheBotao;
	}

	public Cliente getPessoa() {
		return pessoa;
	}

	public void setPessoa(Cliente pessoa) {
		this.pessoa = pessoa;
	}
}
