package GuanabaraPOO.EncapsulamentoeAbstracao.Banco.Controlador;

public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;


    ControleRemoto (){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("está ligado? " + isLigado());
        System.out.println("volume " + getVolume());
        for (int i = 0; i < getVolume(); i += 10){
            System.out.print("|");
        }
        System.out.println("esta reproduzindo? " + isTocando());
    }

    @Override
    public void fecharMenu() {

        System.out.println("Fechando menu");

    }

    @Override
    public void maisVolume() {
        if (this.isLigado()){
            setVolume(getVolume() + 5);
        }
    }
    @Override
    public void menosVolume() {
        if (this.isLigado()){
            setVolume(getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {

        if (isLigado() && getVolume() > 0 ){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {

        if (isLigado() && getVolume() == 0){

            setVolume(50);

        }
    }

    @Override
    public void play() {

        if (isLigado() && !isTocando()){
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (isLigado() && isTocando()){
            setTocando(false);
        }
    }


    // -----------------getters/setters---------------------//


    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


}
