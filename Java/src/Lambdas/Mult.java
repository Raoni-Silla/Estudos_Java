package Lambdas;

public class Mult implements Calculo {
    @Override
    public double executar(double valor1, double valor2) {
        return valor1 * valor2;
    }
}
