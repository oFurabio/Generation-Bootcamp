package dadosIntroducao;

import java.util.Scanner;
import java.util.Stack;

public class Ex02 {

	public void Exercicio02() {
		Scanner ler = new Scanner(System.in);
		Stack<String> pilhaDeLivros = new Stack<String>();
		
		System.out.println("1 - Adicionar Livro na Pilha\n2 - Listar todos os Livros\n3 - Retirar Livro da pilha\n0 - Sair\n");
		
		System.out.print("Entre com a opção desejada: ");
		int entrada = ler.nextInt();
		
		while (entrada != 0) {
			switch (entrada) {
			case 1:
				ler.nextLine();
				System.out.println("Digite o nome: ");
				pilhaDeLivros.push(ler.nextLine());
				System.out.println("Livro adicionado!\n");
				break;
				
			case 2:
				System.out.println("Lista de Livros na Pilha: ");
				System.out.println(pilhaDeLivros + "\n");
				break;
				
			case 3:
				if (!pilhaDeLivros.isEmpty()) {
					System.out.println("Um Livro foi retirado da Pilha!\n");
					pilhaDeLivros.pop();
				} else
					System.out.println("A Pilha está vazia!\n");
				break;
				
			default:
				System.out.println("Opção inválida!\n");
			}
			System.out.print("Entre com a opção desejada: ");
			entrada = ler.nextInt();
			
		}
		pilhaDeLivros.clear();
		System.out.println("Programa Finalizado!");
		
	}
	
}
