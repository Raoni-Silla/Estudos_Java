package Classe.OOheranca;

public class Jogador {
    int life = 100;
    int x;
    int y; //posição do jogador

    Jogador (int x, int y){
        this.x = x;
        this.y = y;
    }



    boolean atacar (Jogador jogador){

        int deltaX = Math.abs(x - jogador.x) ;
        int deltay = Math.abs(y - jogador.y) ;


        if (deltaX == 0 && deltay == 1){
            jogador.life -= 10;
            return true;
        }else if (deltaX == 1 && deltay == 0){
            jogador.life -= 10;
            return true;
        }
        return false;
    }

    boolean andar (Direcao direcao){


        switch (direcao){
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;

        }

        return true;

    }

}
