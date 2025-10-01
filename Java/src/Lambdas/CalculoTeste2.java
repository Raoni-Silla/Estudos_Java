package Lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {

        Calculo soma = (a,b)->{return a+b;}; //funcao anonima soma

        System.out.println(soma.executar(1,2));

    }
}
