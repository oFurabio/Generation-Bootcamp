package vetoresmatrizes;

import java.util.Scanner;

public class Ex03 {
	/*Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
	- Todos os elementos da Diagonal Principal
	- Todos os elementos da Diagonal Secundária
	- A Soma de todos os elementos da Diagonal Principal
	- A Soma de todos os elementos da Diagonal Secundária */
	
	public void Exercicio03() {
		Scanner ler = new Scanner(System.in);
		int[][] matriz = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		int[] vetorPrincipal = new int[matriz.length];
		int[] vetorSecundario = new int[matriz.length];
		int somaPrincipal = 0, somaSecundaria = 0;
		int x = 0, y = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				//	Se a posição da linha e coluna da matriz forem iguais, popula o vetor!
				if (i == j) {
					vetorPrincipal[x] = matriz[i][j];
					somaPrincipal += vetorPrincipal[x];
					x++;
				}
				//	Se a SOMA da posição da linha e coluna da matriz forem iguais ao tamanho da matriz - 1, popula o vetor!
				if ((i + j) == (matriz.length - 1)) {
					vetorSecundario[y] = matriz[i][j];
					somaSecundaria += vetorSecundario[y];
					y++;
				}
			}
		}
		
		System.out.printf("Diagonal Principal: %d - %d - %d", vetorPrincipal[0], vetorPrincipal[1],vetorPrincipal[2]);
		System.out.printf("\nDiagonal Secundária: %d - %d - %d", vetorSecundario[0], vetorSecundario[1], vetorSecundario[2]);
		System.out.printf("\nSoma dos Elementos da Diagonal Principal: %d", somaPrincipal);
		System.out.printf("\nSoma dos Elementos da Diagonal Secundária: %d", somaSecundaria);
	}
	
}
