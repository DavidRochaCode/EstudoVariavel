package relacionamentoEx03;

import java.util.Scanner;

public class CursoRun {

	/*
	 * Escreva uma classe para representar um Curso, que tem nome e horário. Cada
	 * curso tem um professor, que possui nome, departamento e email.Cada curso
	 * também pode ter vários alunos(tipo Aluno). Cada aluno tem nome, matrícula e 4
	 * notas. Escreva um programa teste que crie um Curso com 5 alunos, e que peça
	 * para o usuário entrar com com as 4 notas de cada aluno. Ao final, imprima a
	 * média de cada aluno , se o mesmo está aprovado(média maior ou igual a 7),e
	 * qual é a média da turma.
	 */

	public static void main(String[] args) {

		// Professor
		Scanner scan = new Scanner(System.in);
		Curso curso = new Curso();
		Professor professor = new Professor();

		System.out.println("Entre com o nome do professor(a): ");
		professor.setNome(scan.next());
		System.out.println("Entre com o nome do departamento: ");
		professor.setDepartamento(scan.next());
		System.out.println("Entre com o email do professor(a)");
		professor.setEmail(scan.next());

		// Alunos
		Aluno[] alunos = new Aluno[2];

		for (int i = 0; i < alunos.length; i++) {
			int[] notasAluno = new int[4];
			Aluno aluno = new Aluno();
			System.out.println("Digite o nome do aluno: ");
			aluno.setNome(scan.next());
			System.out.println("Digite a matrícula do aluno: ");
			aluno.setMatricula(scan.next());
			for (int k = 0; k < notasAluno.length; k++) {
				System.out.println("Digite a " + (k + 1) + "º nota do aluno");
				notasAluno[k] = scan.nextInt();
			}
			aluno.setNotas(notasAluno);
			alunos[i] = aluno;
			curso.setAlunos(alunos);
		}

		for (int i = 0; i < alunos.length; i++) {
			if (curso != null && curso.getAlunos() != null) {
				System.out.println(alunos[i].imprimirInfo());
				for (int k = 0; k < 4; k++) {
					System.out.println("Notas do " + (i + 1) + "º aluno: " + alunos[i].notas[k]);
				}
			}

		}

	}
}
