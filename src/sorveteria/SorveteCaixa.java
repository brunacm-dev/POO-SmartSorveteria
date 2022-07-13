package sorveteria;

public class SorveteCaixa extends Sorvete {
	
	@Override
	public double getPreco() {
		System.out.println("-----Preco Caixa");
		if (super.categoria == 1) {
			System.out.println("-----Cat Comum");
			return super.preco * 10.00;
		} else if (super.categoria == 2){
			System.out.println("-----Cat Premium");
			return super.preco * 15.00;
		} else {
			System.out.println("-----Cat Elite");
			return super.preco * 20.00;
		}
	}
}


