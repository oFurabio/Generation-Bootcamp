package exercicioscondicionais;

import java.util.Scanner;

public class Ex05 {

	public void Exercicio05() {
		Scanner ler = new Scanner(System.in);
		int cod, qtd;
		double valor;
		String prod;
		
		System.out.print("Código do Produto: ");
		cod = ler.nextInt();
		
		switch (cod) {
		case 1:
			System.out.print("Quantidade: ");
			qtd = ler.nextInt();
			
			prod = "Cachorro Quente";
			valor = qtd * 10.00;
			System.out.printf("\nProduto: %s\nValor total: R$ %.2f", prod, valor);
			break;
		case 2:
			System.out.print("Quantidade: ");
			qtd = ler.nextInt();
			prod = "X-Salada";
			valor = qtd * 15.00;
			System.out.printf("\nProduto: %s\nValor total: R$ %.2f", prod, valor);
			break;
		case 3:
			System.out.print("Quantidade: ");
			qtd = ler.nextInt();
			prod = "X-Bacon";
			valor = qtd * 18.00;
			System.out.printf("\nProduto: %s\nValor total: R$ %.2f", prod, valor);
			break;
		case 4:
			System.out.print("Quantidade: ");
			qtd = ler.nextInt();
			prod = "Bauru";
			valor = qtd * 12.00;
			System.out.printf("\nProduto: %s\nValor total: R$ %.2f", prod, valor);
			break;
		case 5:
			System.out.print("Quantidade: ");
			qtd = ler.nextInt();
			prod = "Refrigerante";
			valor = qtd * 8.00;
			System.out.printf("\nProduto: %s\nValor total: R$ %.2f", prod, valor);
			break;
		case 6:
			System.out.print("Quantidade: ");
			qtd = ler.nextInt();
			prod = "Suco de Laranja";
			valor = qtd * 13.00;
			System.out.printf("\nProduto: %s\nValor total: R$ %.2f", prod, valor);
			break;
		default:
			System.out.println("\nCódigo de Produto Inválido, tente novamente!\n");
			Exercicio05();
		}
	}
	
}
