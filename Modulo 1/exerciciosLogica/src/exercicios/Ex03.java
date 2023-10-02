package exercicios;

import java.util.Scanner;

public class Ex03 {
	Scanner leia = new Scanner(System.in);
	String entrada = "";
	double salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
	
	public void CalcularSalarioLiquido() {
		System.out.println("Calculadora de salário líquido\n");
		
		System.out.print("Digite o salário bruto: ");
		salarioBruto = leia.nextDouble();
		
		System.out.print("Digite o adicional noturno: ");
		adicionalNoturno = leia.nextDouble();
		
		System.out.print("Digite as horas extras: ");
		horasExtras = leia.nextDouble();
		
		System.out.print("Digite os descontos: ");
		descontos = leia.nextDouble();
		
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		
		System.out.printf("\nO salário líquido é de R$ %.2f reais.\n\n", salarioLiquido);
	}
}
