package EstruturaDeControle.ExerciciosModuloEstruturasRep;

import java.util.Scanner;

/**
 * Criar um programa que enquanto estiver recebendo números positivos,
 * imprime no console a soma dos números inseridos,
 * caso receba um número negativo,
 * encerre o programa. Tente utilizar a estrutura do while.
 */
public class SomaPositivo {
    public static void main(String[] args) {
        Scanner cin = new Scanner (System.in);

        double soma = 0;
        System.out.println("Digite um numero: ");
        int n = cin.nextInt();
        while (n > 0){

            soma += n;
            System.out.println("Digite um numero: ");
            System.out.println("Soma dos numeros digitados esta em: "+ soma);
            System.out.println("===================================");
            n = cin.nextInt();

        }

        System.out.printf("encerrando programa, numero digitado negativo (%d)", n);
        System.out.println("\no resultado da soma total é: "+ soma);

        cin.close();

    }
}
