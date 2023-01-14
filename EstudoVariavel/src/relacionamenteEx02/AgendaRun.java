package relacionamenteEx02;

import java.util.Scanner;

public class AgendaRun {

	/*
	 * Escreva uma classe Agenda, que contém vários contatos do tipo Contato. Cada
	 * contato possui nome, telefone e email. A agenda também possui um nome. Crie
	 * um programa teste que peça para o usuário entrar com o nome da Agenda e em
	 * seguida 3 contatos. Crie médodos que retornem uma String com a informação de
	 * cada contato e também de todos os contatos da agenda
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Agenda agenda = new Agenda();

		System.out.println("Entre com o nome da agenda: ");
		agenda.setNome(scan.next());

		Contato[] contatos = new Contato[3];

		for (int i = 0; i < contatos.length; i++) {
			Contato contato = new Contato();

			System.out.println("Entre com o nome da " + (i + 1) + "º pessoa");
			contato.setNome(scan.next());
			System.out.println("Entre com o Telefone: ");
			contato.setTelefone(scan.next());
			System.out.println("Entre com o email: ");
			contato.setEmail(scan.next());

			contatos[i] = contato;

			// setar o contato na agenda
			agenda.setContatos(contatos);

		}

		System.out.println("Nome da agenda: " + agenda.getNome());
		for (int i = 0; i < contatos.length; i++) {
			if (agenda != null && agenda.getContatos() != null) {
				System.out.println(contatos[i].imprimirInfo());
			}

		}

	}

}
