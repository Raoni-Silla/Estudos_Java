package GuanabaraPOO.Polimorfismo.Sobrecarga;

public class Aula13 {
    public static void main(String[] args) {

       // Animal x = new Animal();
        Lobo m = new Lobo();
        m.emitirSom();
        Dog d = new Dog();
        d.emitirSom();
        d.reagir(false);
        d.reagir("vai apanhar");
        d.reagir(19,20);



    }
}
