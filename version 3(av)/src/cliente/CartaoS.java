package cliente;

import java.util.*;

public class CartaoS {
	private int senha;
	private Cliente titular;
	private int qtdItens = 0;
	private String pedido;
	private ArrayList<CartaoS> pedidos = new ArrayList<>();

	public void imprimeCartaoSS() {
		System.out.println("---------Cartao SmartS:----------");
		System.out.println("Cliente: " + this.titular.getNome());
		System.out.println("Codigo Cartao: " + this.senha);	
		System.out.println("Qtd de Itens: " + this.qtdItens);
	
	}
	
	// falta fazer os pedidos e as compras
	
	
	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getQtdItens() {
		return qtdItens;
	}

	public void setQtdItens(int qtdItens) {
		this.qtdItens = qtdItens;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	

}

	



