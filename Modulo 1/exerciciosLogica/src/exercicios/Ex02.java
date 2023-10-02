package exercicios;

import java.util.Scanner;

public class Ex02 {
	Scanner leia = new Scanner(System.in);
	float media;
	String entrada = "";
	float[] notas = new float[4];
	
	public void CalcularMediaAluno() {
		System.out.println("Calculadora de média do aluno\n");
		
		for (int i = 0; i < 4; i++) {
			System.out.print("Digite a " + (i+1) + "a nota: ");
			notas[i] = leia.nextFloat();
			
			media += notas[i];
		}
	
		media /= 4;
		
		System.out.printf("\nA média é: %.3f\n\n", media);
	}
}
