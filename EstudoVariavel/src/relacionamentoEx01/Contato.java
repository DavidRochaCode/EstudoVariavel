package relacionamentoEx01;

public class Contato {

	private String nome;
	private Endereco endereco;
	private Telefone telefone;
	private Carro[] carros;

	public Carro[] getCarro() {
		return carros;
	}

	public void setCarro(Carro[] carro) {
		this.carros = carro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

}
