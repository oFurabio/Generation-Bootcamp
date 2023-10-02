package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex04 {

	public void Exercicio04() {
		Scanner ler = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		
		System.out.print("Digite o número que você deseja encontrar: ");
		int busca = ler.nextInt();
		
		if(numeros.contains(busca))
			System.out.printf("O número %d foi encontrado!", busca);
		else
			System.out.printf("O número %d não foi encontrado!", busca);
		
		
		
	}
	
}
