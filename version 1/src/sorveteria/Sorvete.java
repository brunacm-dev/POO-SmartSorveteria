package sorveteria;

public abstract class Sorvete {
	protected String sabor;
	protected int categoria = 0; // 1- Comum, 2- Premium, 3 Elite
	protected int qtdEstoque;
	protected double preco = 4.00;
	protected int tipo = 0; // 1 - picole, 2 - casquinha, 3- copo, 4- caixa
	
	
	public double getPreco() {
		System.out.println("-----Preco Caixa");
		if (this.categoria == 1) {
			System.out.println("-----Cat Comum");
			return this.preco;
		} else if (this.categoria == 2){
			System.out.println("-----Cat Premium");
			return this.preco + 2.00;
		} else {
			System.out.println("-----Cat Elite");
			return this.preco * 2.00;
		}
	}

	public int getTipo() {
		return tipo;
		
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public int getCategoria() {
		return categoria;
	}
	
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	
		
}

	


