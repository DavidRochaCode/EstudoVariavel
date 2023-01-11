package construtores;

public class ProdutoTestar {
	
	String marca;
	int numero;
	float preco;
	int matriculaProduto;
	int anoVencimento;
	
	
	//Construtor default, será o objeto sabao >> Permite instanciar objetos sem passar os parâmetros
		ProdutoTestar(){}
	
	//construtor inicializando todos os atributos
	public ProdutoTestar(String marca, int numero, float preco, int matriculaProduto, int anoVencimento) {
		this.marca = marca;
		this.numero = numero;
		this.preco = preco;
		this.matriculaProduto = matriculaProduto;
		this.anoVencimento = anoVencimento;
	}
	
	
	//construtor inicializando 2 atributos >> será o objeto café
	
	public ProdutoTestar(String marca, int numero) {
		this.marca = marca;
		this.numero = numero;
		}
	
	//construtor inicializando 3 atributos
		public ProdutoTestar(String marca, int numero, int anoVencimento) {
			this.marca = marca;
			this.numero = numero;
			this.anoVencimento = anoVencimento;
		}

	}
