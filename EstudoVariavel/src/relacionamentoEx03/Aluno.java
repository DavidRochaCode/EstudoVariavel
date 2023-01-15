package relacionamentoEx03;

public class Aluno {
	private String nome;
	private String matricula;
	public float[] notas;
	private String situacao;

	public String getSiutacao() {
		return situacao;
	}

	public void setSituacao(String sitacao) {
		this.situacao = sitacao;
	}

	public void setNotas(float[] notas) {
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

	public float[] getNotas() {
		return notas;
	}

	public String imprimirInfo() {
		return "Nome: " + this.nome + ", " + "Matrícula: " + this.matricula + " Situação: " + this.situacao + ".";
	}

}
