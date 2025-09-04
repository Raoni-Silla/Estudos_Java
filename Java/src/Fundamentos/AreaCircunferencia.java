package Fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14; // define o pi como uma constante, não podendo mais mudar o valor, constante sempre em maisculo

        double area = PI * raio * raio;
        System.out.println("Area é igual a "+ area + "m².");

    }
}
