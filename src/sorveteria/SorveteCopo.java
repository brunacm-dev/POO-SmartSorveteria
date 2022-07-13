package sorveteria;

public class SorveteCopo extends Sorvete {
	
	private int qtdBolas = 0;
	
	@Override
	public double getPreco() {
		System.out.println("-----Preco Copo");
		if (super.categoria == 1) {
			System.out.println("-----Cat Comum");
			return super.preco * 2.00;
		} else if (super.categoria == 2){
			System.out.println("-----Cat Premium");
			return super.preco + 6.00;
		} else {
			System.out.println("-----Cat Elite");
			return super.preco * 3.00;
		}
	}

	
	public int getQtdBolas() {
		return qtdBolas;
	}
	public void setQtdBolas(int qtdBolas) {
		this.qtdBolas = qtdBolas;
	}

}
