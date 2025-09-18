package EstruturaDeControle.ExerciciosModuloEstruturasRep;

import java.util.Scanner;

/**
 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
 */
public class VerificaPar {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Digite um numero entre 1 e 10: ");
        int n = cin.nextInt();

        if (n > 0 && n <=10){
            if (n % 2 == 0){
                System.out.printf("O Numero Digitado é par (%d)", n);
            }
        }
        cin.close();
    }
}
