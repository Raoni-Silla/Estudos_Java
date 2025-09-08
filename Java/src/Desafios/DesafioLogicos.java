package Desafios;

public class DesafioLogicos {
    public static void main(String[] args) {
        //trabalho terça  v or f
        //trabalho quinta v or f
        //se os dois trabalhos derem certo tv 50 pol = true
        //se apenas um dos dois trabalhos tv32 pol = true
        // e se for comprar qlqr uma tv vao tomar sorvete
        //unico cenario que nao ocorra nada disso é a nao confirmação dos trabalhos

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comrpoutv50 = trabalho1 && trabalho2;
        System.out.println("comprou tv 50?:" + comrpoutv50);
        boolean sorvete =  trabalho1 || trabalho2;
        System.out.println("sorvete?: " + sorvete);
        boolean comproutv35 = trabalho1 ^ trabalho2;

        System.out.println("comprou tv 35? " + comproutv35);
        System.out.println("sorvete?: "+  sorvete);
        System.out.println("sem sorvete ? :" + !sorvete);



    }
}
