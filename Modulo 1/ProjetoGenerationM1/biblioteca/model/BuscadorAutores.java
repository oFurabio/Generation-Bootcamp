package biblioteca.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import biblioteca.Menu;
import biblioteca.util.Cores;

public class BuscadorAutores implements Buscador {
    List<String> encontrados = new ArrayList<>();

    public void Busca(String entrada) {
        Buscando(entrada);
    }

    public void Buscando(String busca) {
        for(int i = 0; i < Menu.listaDeLivros.size(); i++) {
            if(Menu.listaDeLivros.get(i).getAutor().toLowerCase().contains(busca.toLowerCase()))
                encontrados.add(Cores.TEXT_YELLOW_BOLD_BRIGHT+Menu.listaDeLivros.get(i).getAutor()+ ": " +Cores.TEXT_RESET+Menu.listaDeLivros.get(i).getNome());
        }

        long numero = encontrados.stream()
                .filter(x-> x.toString().endsWith("o")).count();

        System.out.println("Autores cujo nome terminam com a letra O: " + numero);

        Mostrar(busca);
    }

    public void Mostrar(String busca) {

        if(!encontrados.isEmpty()) {
            System.out.println("\nAutores contendo: \"" +busca+"\"\n");

            for (int i = 0; i < encontrados.size(); i++)
                System.out.println(encontrados.get(i)+"\n");

            encontrados.clear();
        } else {
            System.out.println(Cores.TEXT_RED_BOLD_BRIGHT+"\nNenhum autor com \""+busca+"\" encontrado!\n");
        }

    }
}
