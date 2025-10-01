package GuanabaraPOO.DesafioPoo.VideoPack;

public class Video implements AcoesVideo {
    private String titulo;
    private int estrela;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    private int somaAvaliacoes;

    public Video(String titulo) {
        setTitulo(titulo);
        setReproduzindo(false);
        setViews(0);
        setCurtidas(0);
        this.estrela = 0;
        this.somaAvaliacoes = 0;
    }


    //==================getters/setters==============================//

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEstrela() {
        return estrela;
    }

    public void novaAvaliacao(int nota) {
        this.somaAvaliacoes = this.somaAvaliacoes + nota;
        this.estrela = this.somaAvaliacoes / this.views;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        setReproduzindo(true);
    }

    @Override
    public void pause() {
        setReproduzindo(false);
    }

    @Override
    public void like() {
        setCurtidas(getCurtidas() + 1);
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo = '" + getTitulo() + '\'' +
                ", estrela = " + getEstrela() +
                ", views = " + getViews() +
                ", curtidas = " + getCurtidas() +
                ", reproduzindo = " + isReproduzindo() +
                '}';
    }
}
