package dadosIntroducao;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01 {
	public void Exercicio01() {
		Scanner ler = new Scanner(System.in);
		Queue<String> filaDoBanco = new LinkedList<String>();

		System.out.println("1 - Adicionar Cliente na Fila\n2 - Listar todos os Clientes\n3 - Retirar Cliente da fila\n0 - Sair\n");

		System.out.print("Entre com a opção desejada: ");
		String entrada = ler.nextLine();

		while (!entrada.equals("0")) {
			switch (entrada) {
			case "1":
				System.out.println("Digite o nome: ");
				filaDoBanco.add(ler.nextLine());
				System.out.println("Cliente adicionado!\n");
				break;

			case "2":
				System.out.println("Lista de Clientes na Fila: ");
				System.out.println(filaDoBanco + "\n");
				break;

			case "3":
				if (!filaDoBanco.isEmpty()) {
					System.out.println("O Cliente foi Chamado!\n");
					filaDoBanco.poll();
				} else
					System.out.println("A Fila está vazia!\n");
				break;

			default:
				System.out.println("Opção inválida!\n");
			}
			System.out.print("Entre com a opção desejada: ");
			entrada = ler.nextLine();
		}
		filaDoBanco.clear();
		System.out.println("Programa Finalizado!");

	}
}
