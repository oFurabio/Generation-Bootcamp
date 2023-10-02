package vetoresmatrizes;

import java.util.Scanner;

public class Ex01 {
	// Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor. Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela.
	
	public void Exercicio01() {
		Scanner ler = new Scanner(System.in);
		boolean existe = false;
		int buscador, posicao = 0, numerosVetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		
		System.out.print("Digite o número que você deseja encontrar: ");
		buscador = ler.nextInt();
		
		for(int i = 0; i < numerosVetor.length; i++) {
			if(buscador == numerosVetor[i]) {
				existe = true;
				posicao = i;
				break;
			}
		}
		
		if(existe) {
			System.out.printf("O numero %d está localizado na posição: %d", buscador, posicao);
		} else {
			System.out.printf("O numero %d não foi encontrado!", buscador);
		}
	}
	
}
