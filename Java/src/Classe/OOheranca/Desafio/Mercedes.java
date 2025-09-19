package Classe.OOheranca.Desafio;

public class Mercedes extends Carro{
    // aqui a sub classe herda todos os metodos e atributos da super classe
    //com uma diferença, a aceleração foi modificada pra essa instancia

    @Override //facilmente sei que esse metodo substitui o metodo da super classe
    void xlr8 (){
        if (this.velAtual + 15 > this.velMax) {
            this.velAtual = velMax;
        }else this.velAtual += 15;
    }


    Mercedes (int velMax){
        super (velMax);
    }


}
