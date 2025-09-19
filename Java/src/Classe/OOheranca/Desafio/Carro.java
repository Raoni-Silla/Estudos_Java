package Classe.OOheranca.Desafio;

public class Carro {

    int velAtual;
    final int velMax;

    Carro (int velMax){

        this.velMax = velMax;

    }

    void xlr8 (){
        if (this.velAtual + 5 > this.velMax) {
            this.velAtual = velMax;
        }else this.velAtual += 5;
    }

    void dxlr8 (){

        if (this.velAtual >= 5) {
            this.velAtual -= 5;
        } else {
            this.velAtual = 0;
        }

    }



}
