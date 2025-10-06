package Lambdas;

@FunctionalInterface // FORÇA A TER UM UNICO METODO NA INTERFACE
public interface Calculo {

    public double executar (double valor1, double valor2);

}
