package exercicioscondicionais;

import java.util.Scanner;

public class Ex08 {
	double saldo = 1000.00;

	public void Exercicio08() {
		Scanner ler = new Scanner(System.in);
		int cod;
		double valor;
		String operacao;
		
		System.out.print("Operação: ");
		cod = ler.nextInt();
		
		switch (cod) {
		case 1:
			operacao = "Saldo";
			
			System.out.printf("\nOperação - %s", operacao);
			System.out.printf("\nSaldo: R$ %.2f\n\n", saldo);
			//Exercicio08();
			break;
		
		case 2:
			operacao = "Saque";
			
			System.out.printf("Valor: R$ ");
			valor = ler.nextDouble();
			
			if(valor > saldo) {
				System.out.println("Saldo insuficiente!");
			} else {
				saldo = saldo - valor; 
				System.out.printf("\nOperação - %s", operacao);
				System.out.printf("\nNovo Saldo: R$ %.2f\n\n", saldo);
			}
			//Exercicio08();
			break;
			
		case 3:
			operacao = "Depósito";
			
			System.out.printf("Valor: R$ ");
			saldo = saldo + ler.nextDouble();
			
			System.out.printf("\nOperação - %s", operacao);
			System.out.printf("\nNovo Saldo: R$ %.2f\n\n", saldo);
			//Exercicio08();
			break;
			
		default:
			System.out.println("\nOperação Inválida!\n");
			Exercicio08();
		}
	}
	
}
