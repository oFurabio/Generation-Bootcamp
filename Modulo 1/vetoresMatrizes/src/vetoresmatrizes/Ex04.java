package vetoresmatrizes;

import java.util.Scanner;

public class Ex04 {

	
	public void Exercicio04() {
		Scanner ler = new Scanner(System.in);
		double medias[] = new double[10];
		double[][] notas = new double[10][4];
		
		System.out.println("CALCULADORA DE MÉDIAS!");
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("\nAluno %d: \n", i+1);
			for(int j = 0; j < notas[i].length; j++) {
				System.out.printf("Nota %d - ", j+1);
				notas[i][j] = ler.nextDouble();
			}
			
		}
		
		for (int i = 0; i < notas.length; i++) {
			for(int j = 0; j < notas[i].length; j++) {
				medias[i] += notas [i][j];
			}
			
			medias[i] /= 4; 
		}
		
		System.out.println();
		
		for (int i = 0; i < medias.length; i++) {
			System.out.printf("Média do aluno %d - %.2f\n", i+1, medias[i]);
		}
		
	}
	
}
