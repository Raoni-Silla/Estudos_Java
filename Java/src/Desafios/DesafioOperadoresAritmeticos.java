package Desafios;

public class DesafioOperadoresAritmeticos {
    public static void main(String[] args) {

        int a = 3 * 4 - 10;
        int b = (int) Math.pow(a,3);
        double c =  Math.pow(a,3);

        System.out.println(b);
        System.out.println(c);

        double for1 = 6 * (3+2);
        double pot1 = Math.pow(for1,2);

        double res1 = pot1 / (3 * 2);

        double for2 = (1-5) * (2-7);
        double div2 = for2 / 2;
        double polt2 = Math.pow(div2,2);

        double resultado = res1 - polt2;
        double polt3 = Math.pow(resultado, 3);
        double div3 = Math.pow(10,3);

        // A correção está nesta linha
        double resultadoFim = polt3 / div3 ;

        System.out.printf("O resultado da formula é: %.1f", resultadoFim);

    }
}