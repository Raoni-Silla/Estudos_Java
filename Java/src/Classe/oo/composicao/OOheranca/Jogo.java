package Classe.oo.composicao.OOheranca;

public class Jogo {

    public static void main(String[] args) {

        Jogador j1 = new Heroi();
        Jogador j2 = new Jogador();
        j1.x = 10;
        j1.y = 10;

        j2.x = 10;
        j2.y = 11;

        System.out.println(j1.life);
        System.out.println(j2.life);

        j1.atacar(j2);
        j2.atacar(j1);

        System.out.println(j1.life);
        System.out.println(j2.life);


    }
}
