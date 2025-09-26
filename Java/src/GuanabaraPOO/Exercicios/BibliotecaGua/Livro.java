package GuanabaraPOO.Exercicios.BibliotecaGua;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    Livro(String titulo, String autor, int totalPag){
        setTitulo(titulo);
        setAutor(autor);
        setTotalPag(totalPag);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totalPag='" + totalPag + '\'' +
                ", aberto=" + aberto +
                ", leitor=" + leitor +
                '}';
    }

    @Override
    public void abrir() {

    }

    @Override
    public void fechar() {

    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;

    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }


}
