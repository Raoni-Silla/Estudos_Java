package Vetores.ExFixacao;

import java.util.Arrays;
import java.util.Scanner;

public class Medias {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        double [] notas = new double[5];

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {

            System.out.printf("digite a nota [%dº]", i + 1);
            notas [i] = cin.nextDouble();
            soma += notas[i];

        }

        double media = soma / notas.length;

        System.out.printf("a media das notas: %s é de %.2f ", Arrays.toString(notas), media);





        cin.close();
    }
}
