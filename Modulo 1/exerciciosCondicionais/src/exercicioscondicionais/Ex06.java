package exercicioscondicionais;

import java.util.Scanner;

public class Ex06 {

	public void Exercicio06() {
		Scanner ler = new Scanner(System.in);
		String cargo;
		double salario;
		
		System.out.print("Nome do colaborador: ");
		String nome = ler.nextLine();
		
		System.out.println("\nDigite o Código do Cargo de Colaborador\n1 - Gerente\n2 - Vendedor\n3 - Supervisor\n4 - Motorista\n5 - Estoquista\n6 - Técnico de TI");
		
		System.out.print("\nCargo: ");
		int cod = ler.nextInt();
		
		switch(cod) {
		case 1:
			cargo = "Gerente";
			
			System.out.print("\nSalário: ");
			salario = ler.nextDouble();
			
			salario = salario + ((salario / 100) * 10);
			
			System.out.printf("\nNome do colaborador: %s\nCargo: %s\nSalário: %.2f", nome, cargo, salario);
			break;
			
		case 2:
			cargo = "Vendedor";
			
			System.out.print("\nSalário: ");
			salario = ler.nextDouble();
			
			salario = salario + ((salario / 100) * 7);
			
			System.out.printf("\nNome do colaborador: %s\nCargo: %s\nSalário: %.2f", nome, cargo, salario);
			break;
			
		case 3:
			cargo = "Supervisor";
			
			System.out.print("\nSalário: ");
			salario = ler.nextDouble();
			
			salario = salario + ((salario / 100) * 9);
			
			System.out.printf("\nNome do colaborador: %s\nCargo: %s\nSalário: %.2f", nome, cargo, salario);
			break;
			
		case 4:
			cargo = "Motorista";
			
			System.out.print("\nSalário: ");
			salario = ler.nextDouble();
			
			salario = salario + ((salario / 100) * 6);
			
			System.out.printf("\nNome do colaborador: %s\nCargo: %s\nSalário: %.2f", nome, cargo, salario);
			break;
			
		case 5:
			cargo = "Estoquista";
			
			System.out.print("\nSalário: ");
			salario = ler.nextDouble();
			
			salario = salario + ((salario / 100) * 5);
			
			System.out.printf("\nNome do colaborador: %s\nCargo: %s\nSalário: %.2f", nome, cargo, salario);
			break;
			
		case 6:
			cargo = "Técnico de TI";
			
			System.out.print("\nSalário: ");
			salario = ler.nextDouble();
			
			salario = salario + ((salario / 100) * 8);
			
			System.out.printf("\nNome do colaborador: %s\nCargo: %s\nSalário: %.2f", nome, cargo, salario);
			break;
			
		default:
			System.out.println("\nCódigo de Cargo incorreto, tente novamente!");
			Exercicio06();
		}
		
	}
	
}
