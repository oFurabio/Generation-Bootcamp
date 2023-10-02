package exerciciosRepeticao;

import java.util.Scanner;

public class Ex01 {
	// Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o
	// primeiro número deve ser menor do que o segundo número. Caso contrário, deve
	// ser exibida uma mensagem na tela informando que o intervalo é inválido e sair
	// do programa. Dentro do intervalo informado, mostre na tela todes os números
	// que são múltiplos de 3 e 5. Veja os exemplos abaixo:

	public void Exercicio01() {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o primeiro número do intervalo: ");
		int primeiro = ler.nextInt();

		System.out.println("Digite o último número do intervalo: ");
		int ultimo = ler.nextInt();

		if (ultimo < primeiro) {
			System.out.println("Intervalo inválido!");
		} else {
			for (int i = primeiro; i < ultimo; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.printf("%d é múltiplo de 3 e 5\n", i);
				}
			}
		}
	}

}
