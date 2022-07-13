package sorveteria;

public class SorvetePicole extends Sorvete {

	@Override
	public double getPreco() {
		System.out.println("-----Preco Picole");
		if (super.categoria == 1) {
			System.out.println("-----Cat Comum");
			return super.preco;
		} else if (super.categoria == 2) {
			System.out.println("-----Cat Premium");
			return super.preco + 2.00;
		} else {
			System.out.println("-----Cat Elite");
			return super.preco * 2.00;
		}
	}
}