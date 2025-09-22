package Classe.ooPolimorfismo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(99.9);
        System.out.println(p1.getPeso());

        Comida arroz = new Arroz(0.25);

        Comida feijao = new Feijao(0.2);

        Comida sorvete = new Sorvete(0.2);

        p1.comer(arroz);
        p1.comer(feijao);
        p1.comer(sorvete);

        System.out.println(p1.getPeso());

        // nao usamos polimorfismo
        //apenas fizemos uma sobrecarga de metodos, multiplas vezes
    }
}
