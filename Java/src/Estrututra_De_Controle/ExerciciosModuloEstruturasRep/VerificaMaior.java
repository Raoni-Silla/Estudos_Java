package Estrututra_De_Controle.ExerciciosModuloEstruturasRep;

import java.util.Scanner;

/**
 * Crie um programa que recebe 10 valores e ao final imprima o maior número.
 */
public class VerificaMaior {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        final int T = 10;
        int aux = 0;
        int n = 0;

        for (int i = 0; i < T; i++){

            System.out.printf("Digite um numero [%d]: ", i + 1);
            n = cin.nextInt();

            if (n > aux){
                aux = n;
            }

        }
        System.out.printf("o maior numero digitado entre os 10 é: %d", aux);
        cin.close();
    }
}
