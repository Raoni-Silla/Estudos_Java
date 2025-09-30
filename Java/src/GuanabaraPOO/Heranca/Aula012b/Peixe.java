package GuanabaraPOO.Heranca.Aula012b;

public class Peixe extends Animal {

    private String corEscama;

    @Override
    public void emitirSom() {
        System.out.println("Peixe emitir som");
    }

    @Override
    public void locomover() {
        System.out.println("Peixe locomover nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Peixe alimentando");
    }

    public void soltarBolha () {
        System.out.println("Peixe soltar bolha");
    }
}
