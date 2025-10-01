package GuanabaraPOO.Polimorfismo.Sobreposicao;

public class Mamifero extends Animal {

    private String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Mamifero emitir som");

    }

    @Override
    public void locomover() {
        System.out.println("Mamifero locomover correndo");

    }

    @Override
    public void alimentar() {
        System.out.println("Mamifero mamando");

    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }


}
