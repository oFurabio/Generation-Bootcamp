package biblioteca.model;

import java.util.InputMismatchException;
import java.util.Scanner;

import biblioteca.Menu;
import biblioteca.util.Cores;

public class LivroNovo extends Livro {
    Scanner ler = new Scanner(System.in);

    public LivroNovo(String nome, String autor, int anoDeLancamento) {
        super(nome, autor, anoDeLancamento);
    }

    @Override
    public void Adicionar() {
        String entrada1, entrada2;
        int entrada3 = 0;

        System.out.println("Digite o nome do livro: ");
        entrada1 = ler.nextLine();
        System.out.println("Digite o nome do autor: ");
        entrada2 = ler.nextLine();
        System.out.println("Digite o ano de lançamento: ");

        try {
            entrada3 = ler.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("\nVocê não digitou um número!\nDigite o ano de lançamento! Exceção: " + e +"\n");
        }

        if(entrada3 != 0)
            Cadastrar(entrada1, entrada2, entrada3);

        ler.nextLine();
    }

    public void Cadastrar(String nome, String autor, int ano) {
        Menu.listaDeLivros.add(new LivroNovo(nome, autor, ano));
        System.out.println("\nLivro cadastrado: " + Cores.TEXT_YELLOW_BOLD_BRIGHT + nome +Cores.TEXT_RESET+ " (" + autor + ") " + ano+"\n");
    }

    public void Remover(String busca) {
        int i;
        boolean achou = false;
        for (i = 0; i < Menu.listaDeLivros.size(); i++) {
            if (Menu.listaDeLivros.get(i).getNome().toLowerCase().contains(busca.toLowerCase())) {
                achou = true;
                break;
            }
        }

        if(achou) {
            Menu.livrosEmprestados.add(new LivroNovo(Menu.listaDeLivros.get(i).getNome(), Menu.listaDeLivros.get(i).getAutor(), Menu.listaDeLivros.get(i).getAnoDeLancamento()));
            System.out.println("\nLivro emprestado: "+Cores.TEXT_YELLOW_BOLD_BRIGHT+Menu.listaDeLivros.get(i).getNome()+Cores.TEXT_RESET+" ("+Menu.listaDeLivros.get(i).getAutor()+")\n");
            Menu.listaDeLivros.remove(Menu.listaDeLivros.get(i));
        } else
            System.out.println(Cores.TEXT_RED_BOLD_BRIGHT+"\nNenhum livro encontrado\n");

    }

    public void MostrarLivrosEmprestados() {
        for (int i = 0; i < Menu.livrosEmprestados.size(); i++)
            System.out.printf(Cores.TEXT_YELLOW_BOLD_BRIGHT + "%s" + Cores.TEXT_RESET + " (%s)\n\n",Menu.livrosEmprestados.get(i).getNome(), Menu.livrosEmprestados.get(i).getAutor());

        System.out.println("Número de livros emprestados: " + Menu.livrosEmprestados.size());
        System.out.printf("\n");
    }

    public void DevolverLivro() {
        if(Menu.livrosEmprestados.size() == 1) {
            Menu.listaDeLivros.add(new LivroNovo(Menu.livrosEmprestados.get(0).getNome(), Menu.livrosEmprestados.get(0).getAutor(), Menu.livrosEmprestados.get(0).getAnoDeLancamento()));
            System.out.println("Livro devolvido: " + Cores.TEXT_YELLOW_BOLD_BRIGHT + Menu.livrosEmprestados.get(0).getNome() +Cores.TEXT_RESET+ " (" + Menu.livrosEmprestados.get(0).getAutor() + ")\n");
            Menu.livrosEmprestados.remove(0);
        } else if(Menu.livrosEmprestados.size() == 0)
            System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT+"Nenhum livro emprestado!\n");
        else {
            System.out.println("Deseja devolver quantos livros? (digite 0 para devolver todos)");
            int qtdDeLivros = ler.nextInt();
            Devolve(qtdDeLivros);
        }
    }

    public void Devolve(int quanti) {
        if(quanti == Menu.livrosEmprestados.size())
            quanti = 0;

        switch(quanti) {
            case 0:
                System.out.println("\nLivros devolvidos:");
                while(Menu.livrosEmprestados.size() != 0) {
                    Menu.listaDeLivros.add(new LivroNovo(Menu.livrosEmprestados.get(0).getNome(), Menu.livrosEmprestados.get(0).getAutor(), Menu.livrosEmprestados.get(0).getAnoDeLancamento()));
                    System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + Menu.livrosEmprestados.get(0).getNome() +Cores.TEXT_RESET+ " (" + Menu.livrosEmprestados.get(0).getAutor() + ")");
                    Menu.livrosEmprestados.remove(0);
                }
                System.out.println("\nTodos os livros foram devolvidos!\n");
                break;
            default:
                for(int j = 0; j < quanti; j++) {
                    ler.nextLine();
                    System.out.println("Digite o nome do "+(j+1)+" livro que deseja devolver:");
                    String nomeLivro = ler.nextLine();

                    for(int i = 0; i < Menu.livrosEmprestados.size(); i++) {
                        if(Menu.livrosEmprestados.get(i).getNome().toLowerCase().contains(nomeLivro.toLowerCase())) {
                            Menu.listaDeLivros.add(new LivroNovo(Menu.livrosEmprestados.get(i).getNome(), Menu.livrosEmprestados.get(i).getAutor(), Menu.livrosEmprestados.get(i).getAnoDeLancamento()));
                            System.out.println("Devolvido: "+Cores.TEXT_YELLOW_BOLD_BRIGHT + Menu.livrosEmprestados.get(i).getNome() +Cores.TEXT_RESET+ " (" + Menu.livrosEmprestados.get(i).getAutor() + ")");
                            Menu.livrosEmprestados.remove(i);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
