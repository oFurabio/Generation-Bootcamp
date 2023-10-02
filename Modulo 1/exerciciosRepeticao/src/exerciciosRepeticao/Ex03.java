package exerciciosRepeticao;

import java.util.Scanner;

public class Ex03 {
	//Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o total de 	pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser 	finalizada ao digitar uma idade negativa.

	public void Exercicio03() {
		Scanner ler = new Scanner(System.in);
		int menor21 = 0, maior50 = 0;
		int entrada = 0;
		
		while(entrada >= 0) {
			System.out.print("Digite uma idade: ");
			entrada = ler.nextInt();
			if(entrada < 0)
				break;
			else if(entrada < 21)
				menor21++;
			else if (entrada > 50)
				maior50++;
		}
		
		System.out.printf("Total de pessoas menores de 21 anos: %d", menor21);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: %d", maior50);
	}
}
