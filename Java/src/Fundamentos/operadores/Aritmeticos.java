package Fundamentos.operadores;

public class Aritmeticos {
    public static void main(String[] args) {
        System.out.println(2+1);
        var x = 45.50;
        double y =2.20;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x / y);
        System.out.println(x * y);

        int a = 8;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        // int e um float ele da o resultado como float, e int e double o resultado é double
        System.out.println(a / (double) b); // aqui ele trunca o valor, pra pegar o valor do resultado da divisão tem que se fazer um cast
        System.out.println(a * b);

        System.out.println(a % b);

    }
}
