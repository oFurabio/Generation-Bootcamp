package exercicioscondicionais;

import java.util.Scanner;

public class Ex03 {

	public void Exercicio03() {
		Scanner ler = new Scanner(System.in);
		String nome;
		int idade;
		boolean firstTimeDoador;
		
		System.out.print("Digite o Nome do doador: ");
		nome = ler.nextLine();
		
		System.out.print("Digite a Idade do doador: ");
		idade = ler.nextInt();
		
		if (idade < 18 || idade > 69) {
			System.out.printf("%s não está apto para doar sangue!", nome);
		} else {
			System.out.print("Primeira doação de sangue? ");
			firstTimeDoador = ler.nextBoolean();
			
			if (idade >= 60 && firstTimeDoador) {
				System.out.printf("%s não está apto para doar sangue!", nome);
			} else {
				System.out.printf("%s está apto a para doar sangue!", nome);
			}
		}
		
	}
	
}
