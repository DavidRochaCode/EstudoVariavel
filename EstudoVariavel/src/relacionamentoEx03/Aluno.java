package relacionamentoEx03;

public class Aluno {
	private String nome;
	private String matricula;
	public int[] notas;

	public void setNotas(int[] notas) {
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int[] getNotas() {
		return notas;
	}

	public String imprimirInfo() {
		return "Nome: " + this.nome + ", " + "Matrícula: " + this.matricula + ", " + "Notas: " + this.nome + ", "
				+ "Notas: " + this.nome + ".";
	}

}
