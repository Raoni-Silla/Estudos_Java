package Lambdas;

public class Soma implements Calculo {

    @Override
    public double executar(double valor1, double valor2) {
        return valor1 + valor2;
    }
}
