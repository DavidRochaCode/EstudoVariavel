package relacionamentoEx01;

public class Endereco {
	private String rua;
	private String complemento;
	private String cidade;
	private String cep;
	private String numero;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String imprimirInfo() {
		return "Rua: " + this.rua + ", " + "Cidade: " + this.cidade + ", " + "complemento: " + this.complemento + ", "
				+ " Cep: " + this.cep + ", " + "Número: " + this.numero + ". ";
	}

}
