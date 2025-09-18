package Classe.oo.composicao.OOheranca;

public class Heroi extends Jogador {

    Heroi (int x, int y){
        super(x,y);
    }

    boolean atacar (Jogador jogador){


        //aqui eu chamo o metodo da classe pai(superclasse)
        boolean atq1 = super.atacar(jogador);
        boolean atq2 = super.atacar(jogador);
        boolean atq3 = super.atacar(jogador);
        boolean atq4 = super.atacar(jogador);

        return atq1 || atq2 || atq3 || atq4;
    }

}
