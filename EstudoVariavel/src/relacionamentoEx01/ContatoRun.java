package relacionamentoEx01;

public class ContatoRun {

	public static void main(String[] args) {

		Contato contato = new Contato();

		contato.setNome("David");
		// contato.setEndereco("Hogwarts"); >> desse modo não funciona
		// Pois contato.setEndereco está esperando como argumento algo do tipo
		// endereco, e não de string.

		// Criar o objeto endereço ( para passar para o set do contato)
		Endereco endereco = new Endereco();
		endereco.setRua("Heitor Villa Lobos");
		endereco.setCidade("Garanhuns");
		endereco.setComplemento("N/A");
		endereco.setNumero("101");
		endereco.setCep("N/A");

		contato.setEndereco(endereco); // essa é a forma certa de instanciar
		// Se eu não fizer isso, o objeto contato vai ter um valor nulo

		Telefone telefone = new Telefone();
		telefone.setDdd("87");
		telefone.setNumero("996263344");
		telefone.setTipo("Celular");

		contato.setTelefone(telefone);// essa é a forma certa de instanciar
		// Se eu não fizer isso, o objeto contato vai ter um valor nulo

		// Criando os dois carros
		// Antes de adicionar ao array, crie os objetos
		Carro carro_1 = new Carro();
		carro_1.setModelo("Civic");
		carro_1.setMarca("Honda");
		carro_1.setAno("2014");

		Carro carro_2 = new Carro();
		carro_2.setModelo("Gol");
		carro_2.setMarca("Wolkswagen");
		carro_2.setAno("2019");

		// vai ser nesse array que eu vou receber o objeto carro_1 e carro_2
		Carro[] carros = new Carro[2];
		carros[0] = carro_1;
		carros[1] = carro_2;

		contato.setCarro(carros);// essa é a forma certa de instanciar
		// Se eu não fizer isso, o objeto contato vai ter um valor nulo

		if (contato != null && contato.getEndereco() != null && contato.getTelefone() != null
				&& contato.getCarro() != null) {
			System.out.println(contato.getEndereco().imprimirInfo());
			System.out.println();
			System.out.println(contato.getTelefone().imprimirInfo());
			System.out.println();

			for (int i = 0; i < carros.length; i++) {
				System.out.println(carros[i].imprimirInfo());
			}
		}

	}

}
