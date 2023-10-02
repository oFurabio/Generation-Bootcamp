package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Ex01 {

	public void Exercicio01() {
		Scanner ler = new Scanner(System.in);
		List<String> cores = new ArrayList<String>();
		String entrada;
		
		System.out.println("Digite 5 cores:");
		
		while(cores.size() != 5) {			
			entrada = ler.nextLine();
			cores.add(entrada);
		}
		
		System.out.println("\nLista de todas as cores:");
		for (String cor : cores)
			System.out.println(cor);
		
		Collections.sort(cores);
		
		System.out.println("\nOrdenar as cores:");
		for (String cor : cores)
			System.out.println(cor);
		
	}
	
}
