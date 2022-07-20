package sorveteria;

public abstract class Sorvete {
	
	protected String sabor;
	protected static int categoria;
	protected double preco;
	protected static int tipo; 
	
	/* parte incompleta e em construção de definir categorias, tipos, sabores  preços
	public void escolheCategoria(int cat) {
		controleCategoria();
		switch (cat) {
		case 1:
			imprimeCategoria();
			imprimePreco();
			break;
		case 2:
			imprimeCategoria();
			imprimePreco();
			break;
		case 3:
			imprimeCategoria();
			imprimePreco();
			break;	
		}
	}
	
	public void escolheTipo(int tipo) {
		controleTipo();
	
		switch (tipo) {
		case 1:
			imprimeTipo();
			imprimePreco();
			break;
		case 2:
			imprimeCategoria();
			imprimePreco();
			break;
		case 3:
			imprimeCategoria();
			imprimePreco();
			break;
			
		}
		
	}
	
	public double precoSorvete() {
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
		
	public void imprimePreco() {
		
	}
	
	public void imprimeCategoria() {
		
	}
	*/
	
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
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	

}
