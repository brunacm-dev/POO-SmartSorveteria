package cliente;


public class Cliente {
	private String nome;
	private String cpf;
	private String telefoneContato;
	private int idade;
	private double saldo = 20.00;
	private static int totalClientes = 0;
	
	
	
	public Cliente(String nome, double saldo){ // String cpf, String telefoneContato, int idade 
		System.out.println("Criando novo Cliente");
		this.nome = nome;
	/*	this.cpf = cpf;
		this.telefoneContato = telefoneContato;
		this.idade = idade; OMITINDO PARA TESTE*/
		this.saldo = saldo;
		System.out.println("Nome:" + this.nome);
		System.out.println("Saldo:"+ this.saldo);
		System.out.println("#############################");
		totalClientes ++;
	}
	
	
	
	
	
	
	// metodos get set
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefoneContato() {
		return telefoneContato;
	}
	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	
// total clientes
	
	public static int getTotalClientes() {
		return totalClientes;
	}

	public static void setTotalClientes(int totalClientes) {
		Cliente.totalClientes = totalClientes;
	}











	
	

}
