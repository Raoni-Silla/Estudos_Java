package GuanabaraPOO.Polimorfismo.Sobreposicao;

public class Ave extends Animal {

    private String corPena;

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");

    }

    @Override
    public void alimentar() {

        System.out.println("Comendo alpiste");
    }

    public void construirNinho (){
        System.out.println("Construir Ninho");
    }
}
