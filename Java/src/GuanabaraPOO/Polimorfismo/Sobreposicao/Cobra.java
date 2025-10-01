package GuanabaraPOO.Polimorfismo.Sobreposicao;

public class Cobra extends Reptil{
    @Override
    public void locomover(){
        System.out.println("Locomover rastejando...");
    }
    public void EmitirSom(){
        System.out.println("shhhhhhh");
    }
}
