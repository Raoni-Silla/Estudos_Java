package Classe.oo.composicao.OOheranca.Desafio;

public class Carro {

    int velAtual;

    void xlr8 (){
        this.velAtual += 5;
    }

    void dxlr8 (){
        if (this.velAtual >= 5) {
            this.velAtual -= 5;
        } else {
            this.velAtual = 0;
        }


    }



}
