package Classe.ooPolimorfismo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(99.9);
        System.out.println(p1.getPeso());

        Arroz arroz = new Arroz(0.25);

        Feijao feijao = new Feijao(0.20);

        Sorvete sorvete = new Sorvete(0.10);

        p1.comer(arroz);
        p1.comerFeijao(feijao);
        p1.comerSor(sorvete);

        System.out.println(p1.getPeso());

        // nao usamos polimorfismo
        //apenas fizemos uma sobrecarga de metodos, multiplas vezes
    }
}
