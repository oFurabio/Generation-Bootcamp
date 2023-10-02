package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex02 {

	public void Exercicio02() {
		Scanner ler = new Scanner(System.in);
		Integer busca;
		List<Integer> numeros = new ArrayList<Integer>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		
		System.out.printf("Digite o número que você deseja encontrar: ");
		busca = ler.nextInt();
		
		if(numeros.contains(busca))
			System.out.printf("O número %d está localizado na posição: %d", busca, numeros.indexOf(busca));
		else
			System.out.printf("O número %d não foi encontrado!", busca);
		
	}
	
}
