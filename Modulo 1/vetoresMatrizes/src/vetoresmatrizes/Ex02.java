package vetoresmatrizes;

import java.util.Scanner;

public class Ex02 {
	/* Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
	Todos os elementos dos índices ímpares do vetor 
	Todos os elementos do vetor que são números pares
	A Soma de todos os elementos do vetor
	A Média de todos os elementos do vetor, armazenada em uma variável do tipo real */
	
	public void Exercicio02() {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[10];
		int soma = 0;
		float media = 0.0f;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %d° número: ", (i+1));
			vetor[i] = ler.nextInt();
			soma += vetor[i];
		}
		
		media = soma / (vetor.length + 0.0f); 
		
		System.out.print("\nElementos nos índices ímpares:");
		for(int i = 0; i < vetor.length; i++) {
			if(i % 2 != 0) {
				System.out.print(" " + vetor[i]);
			}
		}
		System.out.print("\nElementos nos índices pares:");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.print(" " + vetor[i]);
			}
		}
		System.out.printf("\nSoma: %d", soma);
		System.out.printf("\nMédia: " + media);
		
	}
	
}
