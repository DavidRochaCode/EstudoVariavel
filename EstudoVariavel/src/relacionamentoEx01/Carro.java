package relacionamentoEx01;

public class Carro {
	private String marca;
	private String ano;
	private String modelo;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String imprimirInfo() {
		return "Marca: " + this.marca + ", " + "Modelo: " + this.modelo + ", " + "Ano: " + this.ano + ". ";
	}

}
