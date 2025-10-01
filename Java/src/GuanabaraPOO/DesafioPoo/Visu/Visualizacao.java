package GuanabaraPOO.DesafioPoo.Visu;

import GuanabaraPOO.DesafioPoo.Gafanhoto.Gafanhoto;
import GuanabaraPOO.DesafioPoo.VideoPack.Video;

public class Visualizacao {
    private Video filme;
    private Gafanhoto espectador;

   public Visualizacao(Video filme, Gafanhoto espectador) {
        setFilme(filme);
        setEspectador(espectador);
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar(){

    }
    public void avaliar (int nota){}
    public void avaliar(float porcentagem){}

    @Override
    public String toString() {
        return "Visualizacao{" +
                "filme=" + filme +
                ", espectador=" + espectador +
                '}';
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
}
