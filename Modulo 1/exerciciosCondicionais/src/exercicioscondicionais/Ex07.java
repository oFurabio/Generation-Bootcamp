package exercicioscondicionais;

import java.util.Scanner;

public class Ex07 {

	public void Exercicio07() {
		Scanner ler = new Scanner(System.in);
		float n1, n2, resultado;
		int operacao;
		
		System.out.print("Digite o 1° número: ");
		n1 = ler.nextFloat();
		
		System.out.print("Digite o 2° número: ");
		n2 = ler.nextFloat();
		
		System.out.println("\nDigite a operação:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
		
		System.out.print("\nOperação: ");
		operacao = ler.nextInt();
		
		switch(operacao) {
		case 1:
			resultado = n1 + n2;
			System.out.printf("\n%.2f + %.2f = %.2f", n1, n2, resultado);
			break;
			
		case 2:
			resultado = n1 - n2;
			System.out.printf("\n%.2f - %.2f = %.2f", n1, n2, resultado);
			break;
			
		case 3:
			resultado = n1 * n2;
			System.out.printf("\n%.2f X %.2f = %.2f", n1, n2, resultado);
			break;
			
		case 4:
			resultado = n1 / n2;
			System.out.printf("\n%.2f / %.2f = %.2f", n1, n2, resultado);
			break;
			
		default:
			System.out.println("\nOperação Inválida");
			Exercicio07();
		}
	}
	
}
