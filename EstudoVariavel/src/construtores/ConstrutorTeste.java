package construtores;

public class ConstrutorTeste {

	public static void main(String[] args) {

		// Objeto com construtor padrão
		ProdutoTestar sabao = new ProdutoTestar();
		sabao.marca = "Nivea";
		sabao.anoVencimento = 2022;
		sabao.matriculaProduto = 333344;
		sabao.numero = 2233;
		sabao.preco = 2.50f;

		// Objeto com o construtor de dois parâmetros >> o que foi definido lá na classe
		// ProdutoTestar
		ProdutoTestar cafe = new ProdutoTestar("Ouro verde", 2233); // Passar os dois parâmetros
		cafe.preco = 5.00f;
		cafe.matriculaProduto = 444;
		cafe.numero = 44;

		// Objeto com o construtor de dois parâmetros >> o que foi definido lá na classe
		// ProdutoTestar
		ProdutoTestar biscoito = new ProdutoTestar("Treloso", 2233, 2022); // Passar os dois parâmetros
		biscoito.preco = 5.00f;
		cafe.matriculaProduto = 444;

		// Se clicar em cima do objeto , e apertar F3, você será levado até o construtor
		// dele;

	}

}
