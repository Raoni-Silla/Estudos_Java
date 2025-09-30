package GuanabaraPOO.Polimorfismo.Aula012b;

public class Cachorro extends Mamifero{
    @Override
    public void Locomover() {
        System.out.println(
                "Locomover andando..."
        );

    }

    public void EmitirSom(){
        System.out.println("Emitir som latido...");
    }
}
