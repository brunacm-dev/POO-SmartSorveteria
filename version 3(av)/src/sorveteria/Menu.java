package sorveteria;

public class Menu {

	public static void imprimeNomeC() {
		System.out.println("Digite seu Nome: ");
}
	
	public static void imprimeIdadeC() {
		System.out.println("Digite sua Idade: ");
		
	}
	public static void imprimemesDeNiverC() {
		System.out.println("Digite o numero do seu Mes de Niver: ");
		
	}
	
	public static void dadoInvalido() {
		System.out.println("Dado Invalido");
	}
	
	public static void senhaInvalida() {
		System.out.println("Senha Invalida");
	}
	
	public static void imprimeMsgCadastro() {
		System.out.println("---------Infos:----------");
		System.out.println("Cliente não Cadastrado");
		System.out.println("Para se Cadastrar Digite 1, Para Sair Digite 0");
	}
	
	public static void imprimeCadastro() {
		System.out.println("---------Cadastrando Cliente----------");

	}
		
	public static void imprimeAcesso() {
		System.out.println("---------Boas compras----------");

	}

	public static void imprimeControleEntrada() {
		System.out.println("Para Entrar Digite 2, Para se Cadastrar Digite 1, Para Sair Digite 0");
	}
	
	public static void imprimeControleId() {
		System.out.println("Digite sua senha de cadastro do CartaoS: ");
	}
	
	
	public static void imprimeMsgInicial(int num) {
		System.out.println("---------Boas Vindas:----------");
		System.out.println("Maquina n: " + num);
	}
	
	public static void imprimeMsgFinal() {
		System.out.println("---------Obrigada por ter vindo, Até logo!----------");
	}
	
	public static void controleCategoria() {
		System.out.println("Digite 1 para Categoria Comum, 2 para Catergoria Premium, 3 para Categoria Elite");
		
	}
	public static void controleTipo() {
		System.out.println("Digite 1 para Sorvete Picole, 2 para Sorvetes de Caixa");
		
	}
}