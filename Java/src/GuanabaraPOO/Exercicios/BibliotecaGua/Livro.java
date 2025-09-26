package GuanabaraPOO.Exercicios.BibliotecaGua;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
        setTitulo(titulo);
        setAutor(autor);
        setTotalPag(totalPag);
        setAberto(false);
        setPagAtual(0);
        setLeitor(leitor);

    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totalPag='" + totalPag + '\'' +
                ", aberto=" + aberto +
                ", leitor=" + leitor.getNome() +
                '}';
    }

    @Override
    public void abrir() {
        if (aberto == true) {
            System.out.println("Aberta!");
        }

    }

    @Override
    public void fechar() {

        if (aberto == true) {
            System.out.println("Fechada!");
            aberto = false;
        }

    }

    @Override
    public void folhear(int p) {
        if (p > totalPag) {
            this.pagAtual = p;
        }else  {
            this.pagAtual = p - totalPag;
        }


    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }


    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
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
