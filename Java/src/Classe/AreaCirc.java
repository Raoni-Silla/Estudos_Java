package Classe;

public class AreaCirc {

    double raio;
    static final double PI = 3.14; //o final decreta que esse valor nao vai mudar mais, o static seta esse valor para todos os objetos criados dessa classe

    AreaCirc (double raioiInicial){

        raio = raioiInicial;

    }

    double area (){
        return Math.pow(raio,2) * PI;//power é um metodo estatico, aonde nao preciso instanciar objetos pra acessar ele
    }

    static double area (double raioninit){ //esse atributo agora pertence a classe e nao ao objeto, nao precisando instanciar um objeto dessa classe para acessar esse metodo
        return Math.pow(raioninit,2) * PI;
    }

}
