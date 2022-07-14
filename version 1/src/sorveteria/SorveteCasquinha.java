package sorveteria;

public class SorveteCasquinha extends Sorvete{
	
	int qtdBolas = 0;
	
	@Override 
	public double getPreco() {
		System.out.println("-----Preco Casquinha");
		if (super.categoria == 1) {
			System.out.println("-----Cat Comum");
			return super.preco + 2.00;
		} else if (super.categoria == 2){
			System.out.println("-----Cat Premium");
			return super.preco * 2.00;
		} else {
			System.out.println("-----Cat Elite");
			return super.preco + 6.00;
		}
	}
	
	
	public int getQtdBolas() {
		System.out.println("-----Qtd Bolas Casquinha");
		return qtdBolas;
	}
	public void setQtdBolas(int qtdBolas) {
		this.qtdBolas = qtdBolas;
	}
}
