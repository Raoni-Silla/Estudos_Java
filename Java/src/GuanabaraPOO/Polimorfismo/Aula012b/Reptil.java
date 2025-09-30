package GuanabaraPOO.Polimorfismo.Aula012b;

public class Reptil extends Animal {

    private String corEscama;

    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil");
    }

    @Override
    public void locomover() {
        System.out.println("rastejo");

    }

    @Override
    public void alimentar() {
        System.out.println("alimentando reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
