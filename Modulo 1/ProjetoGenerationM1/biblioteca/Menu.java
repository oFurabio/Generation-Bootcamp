package biblioteca;

import java.io.IOException;
import java.util.*;


import biblioteca.model.BuscadorAutores;
import biblioteca.model.BuscadorLivros;
import biblioteca.model.GerenteLivros;
import biblioteca.model.Livro;
import biblioteca.model.LivroNovo;
import biblioteca.util.Cores;

public class Menu {

    public static final List<Livro> listaDeLivros = new ArrayList<>();
    public static final List<Livro> livrosEmprestados = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException  {
        Scanner ler = new Scanner(System.in);
        BuscadorLivros buscarL = new BuscadorLivros();
        BuscadorAutores buscarA = new BuscadorAutores();
        LivroNovo ln = new LivroNovo(null, null, 0);
        String entrada;
        int opcao = 0;

        GerenteLivros lf = new GerenteLivros();
        lf.InstanciarLivros();

        while (true) {
            System.out.println(Cores.TEXT_BLUE_BOLD + Cores.ANSI_WHITE_BACKGROUND
                    + "***************************************");
            System.out.println("*                                     *");
            System.out.println("*       Biblioteca  FS Farias         *");
            System.out.println("*                                     *");
            System.out.println("***************************************");
            System.out.println("*                                     *");
            System.out.println("*       1 - Mostrar Livros            *");
            System.out.println("*       2 - Procurar Livro            *");
            System.out.println("*       3 - Procurar Autor            *");
            System.out.println("*       4 - Cadastrar novo livro      *");
            System.out.println("*       5 - Pegar livro emprestado    *");
            System.out.println("*       6 - Devolver livro            *");
            System.out.println("*       7 - Ver livros emprestados    *");
            System.out.println("*       9 - Sair                      *");
            System.out.println("*                                     *");
            System.out.println("***************************************");
            System.out.println("Digite o número da operação:           ");
            System.out.println("                                       " + Cores.TEXT_RESET);

            try {
                opcao = ler.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("\nVocê não digitou um número!\nDigite o número da operação! Exceção: " + e +"\n");
                ler.nextLine();
                opcao = 0;
            }

            if (opcao == 9) {
                System.out.println("\nFechando o programa...");
                Carregar();
                System.out.println(Cores.TEXT_WHITE_BOLD + "\nObrigado e volte sempre! (^‿^)");
                ler.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("\nSELECIONADO: MOSTRAR LIVROS DISPONÍVEIS\n");
                    lf.MostrarLivros();
                    ApertaEnter();
                    break;
                case 2:
                    ler.nextLine();
                    System.out.println("\nSELECIONADO: PROCURAR LIVRO\n");
                    System.out.println("Digite o nome do livro: ");
                    entrada = ler.nextLine();

                    Optional<String> checaNulo = Optional.ofNullable(entrada);

                    if(checaNulo.isPresent() && !entrada.isEmpty())
                        buscarL.Busca(entrada);
                    else
                        System.out.println("A entrada é nula!");

                    ApertaEnter();
                    break;
                case 3:
                    ler.nextLine();
                    System.out.println("\nSELECIONADO: PROCURAR AUTOR\n");
                    System.out.println("Digite o nome do(a) autor(a): ");
                    entrada = ler.nextLine();
                    buscarA.Busca(entrada);
                    ApertaEnter();
                    break;
                case 4:
                    System.out.println("\nSELECIONADO: CADASTRAR NOVO LIVRO\n");
                    ln.Adicionar();
                    ApertaEnter();
                    break;
                case 5:
                    System.out.println("\nSELECIONADO: PEGAR LIVRO EMPRESTADO\n");
                    ler.nextLine();
                    System.out.println("Digite o nome do livro: ");
                    entrada = ler.nextLine();
                    ln.Remover(entrada);
                    ApertaEnter();
                    break;
                case 6:
                    System.out.println("\nSELECIONADO: DEVOLVER LIVRO\n");
                    ln.DevolverLivro();
                    ApertaEnter();
                    break;
                case 7:
                    System.out.println("\nSELECIONADO: VER LIVROS EMPRESTADOS\n");
                    ln.MostrarLivrosEmprestados();
                    ApertaEnter();
                    break;
                case 0:
                    break;
                default:
                    System.out.println(Cores.TEXT_RED_BOLD + "\nOpção inválida! (≖_≖\")\n");

                    ApertaEnter();
                    break;
            }
        }

    }

    public static void ApertaEnter() {
        try {
            System.out.println(Cores.TEXT_RESET + "Pressione Enter para Continuar...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
    }

    public static void Carregar() throws InterruptedException {
        System.out.printf(Cores.TEXT_GREEN_BOLD + "[");
        for(int i = 0; i < 37; i++) {
            System.out.printf("■");
            Thread.sleep(25L);
        }
        System.out.println("]");
    }

}
