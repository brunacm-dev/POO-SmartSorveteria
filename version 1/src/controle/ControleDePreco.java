package controle;

import sorveteria.Sorvete;

public class ControleDePreco {
	
	private double precoCont;
	
	public void precifica(Sorvete s) {
		double valor = s.getPreco(); 
		this.precoCont =  valor;
	}
	
	
	public double getPrecoCont() {
		return precoCont;
	}
}
