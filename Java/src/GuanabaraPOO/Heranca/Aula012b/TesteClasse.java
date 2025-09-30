package GuanabaraPOO.Heranca.Aula012b;

public class TesteClasse {
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();

        m1.setCorPelo("Marrom");
        m1.setPeso("90 kgs");
        m1.alimentar();
        m1.locomover();
        m1.emitirSom();

        Canguru c1 = new Canguru();
        Cachorro c2 = new Cachorro();
        Arara a2 = new Arara();
        Cobra co = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        GoldFish gf = new GoldFish();

    }
}
