package collections;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Ex03 {

	public void Exercicio03() {
		Scanner ler = new Scanner(System.in);
		
		int numeroDeEntradas = 10;
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		for(int i = 0; i < numeroDeEntradas; i++) {
			System.out.printf("Digite o %d° número: ", i+1);
			numeros.add(ler.nextInt());
		}
		
		Iterator<Integer> itNumeros = numeros.iterator();
		
		while(itNumeros.hasNext())
			System.out.println(itNumeros.next());

	}
	
}
