package exercicios;

import java.util.Scanner;

public class Ex01 {
	Scanner leia = new Scanner(System.in);
	double salario, abono, novoSalario = 0;
	String entrada = "";
	
	public void CalcularNovoSalario() {
		System.out.println("Calculadora de novo salário\n");
		
		System.out.print("Digite o salário: ");
		salario = leia.nextDouble();
	
		System.out.print("Digite o abono: ");
		abono = leia.nextDouble();
	
	
		novoSalario = salario + abono;
	
	
		System.out.printf("\nSeu novo salário é de R$ %.2f reais.\n\n", novoSalario);
	}
}
