package relacionamentoEx01;

public class Telefone {
	String tipo;
	String ddd;
	String numero;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String imprimirInfo() {
		return "Tipo: " + this.tipo + ", " + "DDD: " + this.ddd + ", " + "Número: " + this.numero + ". ";
	}

}
