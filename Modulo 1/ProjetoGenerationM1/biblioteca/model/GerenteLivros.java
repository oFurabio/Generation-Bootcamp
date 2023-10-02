package biblioteca.model;

import biblioteca.Menu;
import biblioteca.util.Cores;

public class GerenteLivros {

    public void InstanciarLivros() {
        Menu.listaDeLivros.add(new LivroNovo("Ao Farol", "Virginia Woolf", 1927));
        Menu.listaDeLivros.add(new LivroNovo("A casa dos espíritos", "Isabel Allende", 1982));
        Menu.listaDeLivros.add(new LivroNovo("Memórias póstumas de Brás Cubas", "Machado de Assis", 1881));
        Menu.listaDeLivros.add(new LivroNovo("Cem Anos de Solidão", "Gabriel García Márquez", 1967));
        Menu.listaDeLivros.add(new LivroNovo("O Rei Lear", "William Shakespeare", 1606));
        Menu.listaDeLivros.add(new LivroNovo("Moby Dick", "Herman Melville", 1851));
        Menu.listaDeLivros.add(new LivroNovo("A Divina Comédia", "Dante Alighieri", 1472));
        Menu.listaDeLivros.add(new LivroNovo("O jogo da amarelinha", "Julio Cortázar", 1963));
        Menu.listaDeLivros.add(new LivroNovo("O Livro do Desassossego", "Fernando Pessoa", 1982));
        Menu.listaDeLivros.add(new LivroNovo("Pantagruel", "François Rabelais", 1532));
        Menu.listaDeLivros.add(new LivroNovo("Quarto de despejo", "Carolina Maria de Jesus", 1960));
        Menu.listaDeLivros.add(new LivroNovo("Madame Bovary", "Gustave Flaubert", 1856));
        Menu.listaDeLivros.add(new LivroNovo("Guerra e Paz", "Liev Tolstói", 1869));
        Menu.listaDeLivros.add(new LivroNovo("A Hora da Estrela", "Clarice Lispector", 1977));
        Menu.listaDeLivros.add(new LivroNovo("1984", "George Orwell", 1949));
        Menu.listaDeLivros.add(new LivroNovo("Grandes Esperanças", "Charles Dickens", 1861));
        Menu.listaDeLivros.add(new LivroNovo("O Velho e o Mar", "Ernest Hemingway", 1952));
        Menu.listaDeLivros.add(new LivroNovo("A Metamorfose", "Franz Kafka", 1915));
        Menu.listaDeLivros.add(new LivroNovo("O Código Da Vinci", "Dan Brown", 2003));
        Menu.listaDeLivros.add(new LivroNovo("A Sociedade do Anel", "J. R. R. Tolkien", 1954));
    }

    public void MostrarLivros() {
        for(int i = 0; i<Menu.listaDeLivros.size(); i++) {
            System.out.printf(Cores.TEXT_YELLOW_BOLD_BRIGHT+"%s"+Cores.TEXT_RESET+" (%s)\n\n",Menu.listaDeLivros.get(i).getNome(), Menu.listaDeLivros.get(i).getAutor());
        }

        System.out.println("Número de livros: "+Cores.TEXT_CYAN_BOLD_BRIGHT+Menu.listaDeLivros.size());
        System.out.printf("\n");
    }
}
