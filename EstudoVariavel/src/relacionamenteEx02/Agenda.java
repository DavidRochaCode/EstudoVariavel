package relacionamenteEx02;

public class Agenda {

	private String nome;
	private Contato[] contatos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public String imprimirInfo() {
		return "Nome: " + this.nome + ".";
	}

}
