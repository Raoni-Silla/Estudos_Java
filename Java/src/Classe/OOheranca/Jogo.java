package Classe.OOheranca;

public class Jogo {

    public static void main(String[] args) {

        Jogador heroi = new Heroi(12, 3);
        Jogador j2 = new Jogador(11, 2);
        heroi.x = 10;
        heroi.y = 10;

        j2.x = 10;
        j2.y = 11;

        System.out.println("hp hero: " + heroi.life);
        System.out.println("hp jogador " + j2.life);

        heroi.atacar(j2);
        j2.atacar(heroi);

        System.out.println(heroi.life);
        System.out.println(j2.life);


    }
}
