package exercicioscondicionais;

import java.util.Scanner;

public class Ex02 {
	
	public void Exercicio02() {
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um número inteiro: ");
		num = ler.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.printf("O número %d é par e positivo!", num);
			} else {
				System.out.printf("O número %d é ímpar e positivo!", num);
			}
		} else if (num < 0) {
			if(num % -2 == 0) {
				System.out.printf("O número %d é par e negativo!", num);
			} else {
				System.out.printf("O número %d é ímpar e negativo!", num);
			}
		} else {
			System.out.println("O número 0 é par!");
		}
	}
	
}
