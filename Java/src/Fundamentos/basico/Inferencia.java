package Fundamentos.basico;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);

        var b = 4.5; // o java vai inferir pelo tipo da variavel e valor colocado qual é o tipo da variavel
        System.out.println(b);
        var c = "Texto";
        System.out.println(c);
        c = "new_text";
        System.out.println(c);

        // quando se tem uma inferencia não pode se mudar o valor, sempre sendo de um determinado tipo e esse nunca ira mudar
        //c = 7; isso da erro, porque o java ja entendeu que a variavel "c" é string

        double d; // variavel declarada
        d = 123.65; // inicializada
        System.out.println(d); // usada


        //var e; quando se usa var, é preciso inicializar ela em uma unica linha
        //e = 12345;
        // inferencia é o fato que voce consegue criar variaveis usando a palavra var, porem apartir do valor definido nao pode mais ser mudado
    }
}
