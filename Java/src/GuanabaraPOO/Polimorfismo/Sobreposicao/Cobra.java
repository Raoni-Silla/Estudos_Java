package GuanabaraPOO.Polimorfismo.Sobreposicao;

public class Cobra extends Reptil{
    @Override
    public void Locomover(){
        System.out.println("Locomover rastejando...");
    }
    public void EmitirSom(){
        System.out.println("shhhhhhh");
    }
}
