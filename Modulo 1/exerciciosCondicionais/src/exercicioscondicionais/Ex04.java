package exercicioscondicionais;

import java.util.Scanner;

public class Ex04 {

	public void Exercicio04() {
		Scanner ler = new Scanner(System.in);
		String entrada;

		System.out.println("Digite a primeira característica (Vertebrado / Invertebrado)");
		entrada = ler.nextLine();

		if (entrada.equalsIgnoreCase("vertebrado")) {
			System.out.println("Digite a segunda característica (Ave / Mamifero)");
			entrada = ler.nextLine();

			if (entrada.equalsIgnoreCase("ave")) {
				System.out.println("Digite a terceira e última característica (Carnivoro/ Onivoro)");
				entrada = ler.nextLine();

				if (entrada.equalsIgnoreCase("carnivoro")) {
					System.out.println("Águia");
				} else if (entrada.equalsIgnoreCase("onivoro")) {
					System.out.println("Pomba");
				} else {
					System.out.println("Tá errado, escreve de novo");
				}
			} else if (entrada.equalsIgnoreCase("mamifero")) {
				System.out.println("Digite a terceira e última característica (Onivoro/ Herbivoro)");
				entrada = ler.nextLine();

				if (entrada.equalsIgnoreCase("onivoro")) {
					System.out.println("Homem");
				} else if (entrada.equalsIgnoreCase("herbivoro")) {
					System.out.println("Vaca");
				} else {
					System.out.println("Tá errado, escreve de novo");
				}
			} else {
				System.out.println("Tá errado, escreve de novo");
			}
		} else if (entrada.equalsIgnoreCase("invertebrado")) {
			System.out.println("Digite a segunda característica (Inseto/ Anelideo)");
			entrada = ler.nextLine();

			if (entrada.equalsIgnoreCase("inseto")) {
				System.out.println("Digite a terceira e última característica (Hematofago/ Herbivoro)");
				entrada = ler.nextLine();

				if (entrada.equalsIgnoreCase("hematofago")) {
					System.out.println("Pulga");
				} else if (entrada.equalsIgnoreCase("herbivoro")) {
					System.out.println("Lagarta");
				} else {
					System.out.println("Tá errado, escreve de novo");
				}
			} else if (entrada.equalsIgnoreCase("anelideo")) {
				System.out.println("Digite a terceira e última característica (Hematofago/ Onivoro)");
				entrada = ler.nextLine();

				if (entrada.equalsIgnoreCase("hematofago")) {
					System.out.println("Sanguessuga");
				} else if (entrada.equalsIgnoreCase("onivoro")) {
					System.out.println("Minhoca");
				} else {
					System.out.println("Tá errado, escreve de novo");
				}
			} else {
				System.out.println("Tá errado, escreve de novo");
			}
		} else {
			System.out.println("Tá errado, escreve de novo");
		}
	}
}
