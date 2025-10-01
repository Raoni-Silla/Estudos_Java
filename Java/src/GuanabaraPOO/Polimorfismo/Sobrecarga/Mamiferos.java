package GuanabaraPOO.Polimorfismo.Sobrecarga;

public class Mamiferos extends Animal{

    protected String corPelo;



    public void emitirSom(){
        System.out.println("Emitido Som de Mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
