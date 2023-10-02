package exercicios;

import java.util.Scanner;

public class Ex04 {
	Scanner leia = new Scanner(System.in);
	String entrada = "";
	float[] num = new float[4];
	float diferenca;
	
	
	public void CalcularDiferenca() {
		System.out.println("Calculadora de diferenças\n");
		
		
		for (int i = 0; i < 4; i++) {
			System.out.print("Digite o " + (i+1) + "o número: ");
			num[i] = leia.nextFloat();
		}
		
		
		diferenca = (num[0] * num[1] - num[2] * num[3]);
		
		
		System.out.printf("\nA diferença entre o produto dos números é de: %.2f.\n\n", diferenca);
	}
}
