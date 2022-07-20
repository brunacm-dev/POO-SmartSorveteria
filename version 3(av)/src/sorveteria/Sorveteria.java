package sorveteria;

import java.io.*;
import java.util.*;
import avaliacao.*;

import cliente.Cliente;

public class Sorveteria {
	private String nome;
	private boolean giraRoleta = false;
	private int numMaquina;
	private static int totalClientes = 0;
	private int escolheBotao;
	private Cliente pessoa;
	private Menu tela;
	// tentar usar ArrayList futuramente
	// private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public Sorveteria(String nome, int numMaquina) {
		this.nome = nome;
		this.numMaquina = numMaquina;
		Menu.imprimeMsgInicial(numMaquina);
	}

	public void entrada(Cliente pessoa) {
		Scanner input = new Scanner(System.in);
		Menu.imprimeControleEntrada();
		escolheBotao = input.nextInt();
		switch (escolheBotao) {
		case 0:
			Menu.imprimeMsgFinal();
			break;
		case 1:
			cadastraCliente(pessoa);
			totalClientes++;
			giraRoleta = true;
			break;
		case 2:
			verificaCadastro(pessoa);
			break;
		}
	}

	public void verificaCadastro(Cliente pessoa) {
		Scanner input = new Scanner(System.in);
		Menu.imprimeControleId();
		int senha = input.nextInt();
		verificaSenha(senha);
		Menu.imprimeAcesso();
		giraRoleta = true;
	}

	public void cadastraCliente(Cliente pessoa) {
		Scanner input = new Scanner(System.in);
		Menu.imprimeNomeC();
		String cNome = input.nextLine();
		// fazer condicao para nome ser apenas string
		pessoa.setNome(cNome);

		Menu.imprimemesDeNiverC();
		int cMes = input.nextInt();
		if (cMes >= 1 && cMes <= 12) {
			pessoa.setMesDeNiver(cMes);
		} else {
			Menu.dadoInvalido();
			Menu.imprimeMsgFinal();
			return;
		}

		Menu.imprimeIdadeC();
		int cIdade = input.nextInt();
		if (cIdade >= 18 && cMes <= 110) {
			pessoa.setIdade(cIdade);
		} else {
			Menu.dadoInvalido();
			Menu.imprimeMsgFinal();
			return;
		}
		Menu.imprimeCadastro();
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

	public void definirSenha(int num) {
		if (num >= 1000 && num <= 9999) {
			pessoa.getCartao().setSenha(num);
		} else {
			Menu.senhaInvalida();
			Menu.imprimeMsgCadastro();
			Scanner input = new Scanner(System.in);
			escolheBotao = input.nextInt();
			switch (escolheBotao) {
			case 0:
				Menu.imprimeMsgFinal();
				break;
			case 1:
				cadastraCliente(pessoa);
				giraRoleta = true;
				break;
			}
		}
	}

	public boolean verificaSenha(int num) {
		if (num >= 1000 && num <= 9999) {
			return true;
		} else {
			Menu.senhaInvalida();
			return false;
		}
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

	public static int getTotalClientes() {
		return totalClientes;
	}

	public static void setTotalClientes(int totalClientes) {
		Sorveteria.totalClientes = totalClientes;
	}
}
