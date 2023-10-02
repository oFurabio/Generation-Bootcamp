package exercicioscondicionais;

import java.util.Scanner;

public class Ex01 {
	
	public void Exercicio01() {
		Scanner ler = new Scanner(System.in);
		int a, b, c, soma;
		
		System.out.print("Digite o número A: ");
		a = ler.nextInt();
		
		System.out.print("Digite o número B: ");
		b = ler.nextInt();
		
		System.out.print("Digite o número C: ");
		c = ler.nextInt();
		
		soma = a + b;
		
		if(soma > c) {
			System.out.printf("\n%d + %d = %d > %d\n", a, b, soma, c);
			System.out.print("A soma de A + B é Maior do que C");
		}
		else if(soma < c) {
			System.out.printf("\n%d + %d = %d < %d\n", a, b, soma, c);
			System.out.print("A soma de A + B é Menor do que C");
		}
		else {
			System.out.printf("\n%d + %d = %d = %d\n", a, b, soma, c);
			System.out.print("A soma de A + B é Igual a C");
		}
	}
	
}
