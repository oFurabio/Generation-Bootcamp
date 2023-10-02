package exerciciosRepeticao;

import java.util.Scanner;

public class Ex05 {
	//	Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. Ao final, mostre na 	tela a soma de todos os números digitados, que sejam positivos.
	
	public void Exercicio05() {
		Scanner ler = new Scanner(System.in);
		int entrada = 0;
		int soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			entrada = ler.nextInt();
			if(entrada > 0)
				soma += entrada;
		} while (entrada != 0);
		
		System.out.printf("A soma dos números positivos é: %d", soma);
	}
}
