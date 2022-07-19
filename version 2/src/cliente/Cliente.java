package cliente;

public class Cliente {
	
	

	private int id;
	private String nome;
	private int idade;
	private int mesDeNiver;
	protected CartaoS cartao;

	
	public CartaoS getCartao() {
		return cartao;
	}

	public void setCartao(CartaoS cartao) {
		this.cartao = cartao;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMesDeNiver() {
		return mesDeNiver;
	}

	public void setMesDeNiver(int mesDeNiver) {
		this.mesDeNiver = mesDeNiver;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
