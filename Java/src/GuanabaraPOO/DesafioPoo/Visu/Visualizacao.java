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
        this.filme.setEstrela(5);
    }
    public void avaliar (int nota){
       this.filme.setEstrela(nota);
    }
    public void avaliar(float porcentagem){
       int tot = 0;
       if  (porcentagem>=0 && porcentagem<=20){
           tot = 3;
       }else if (porcentagem>=20 && porcentagem<=50){
           tot = 5;
       }else if (porcentagem>=50 && porcentagem<=90){
           tot = 8;
       }else tot = 10;
    }

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
