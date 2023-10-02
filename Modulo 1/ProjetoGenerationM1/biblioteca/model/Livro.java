package biblioteca.model;

public abstract class Livro {

    private String nome;
    private String autor;
    private int anoDeLancamento;


    public Livro(String nome, String autor, int anoDeLancamento) {
        super();
        this.nome = nome;
        this.autor = autor;
        this.anoDeLancamento = anoDeLancamento;
    }


    public String getNome() { return nome; }


    public void setNome(String nome) { this.nome = nome; }


    public String getAutor() { return autor; }


    public void setAutor(String autor) { this.autor = autor; }


    public int getAnoDeLancamento() { return anoDeLancamento; }


    public void setAnoDeLancamento(int anoDeLancamento) { this.anoDeLancamento = anoDeLancamento; }

    public abstract void Cadastrar(String nome, String autor, int ano);
    public abstract void Adicionar();
    public abstract void Remover(String busca);

}
