package Lambdas;

public class CalculoTeste1 {
    public static void main(String[] args) {
        Calculo soma = new Soma();
        Calculo mult = new Mult();

        System.out.println(soma.executar(2, 3));
        System.out.println(mult.executar(2, 3));

    }
}
