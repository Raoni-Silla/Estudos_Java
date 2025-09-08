package Desafios;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner cin = new Scanner (System.in);
        int valor = 0;
        double nota = 0;
        double total = 0.0;
        int i = 0;

        while (true) {
            System.out.println("Digite uma nota (ou -1 para sair):");
            nota = cin.nextDouble();


            if (nota == -1) {
                break; // Sai do loop
            }


            if (nota >= 0 && nota <= 10) {
                total += nota;
                i++;
            } else {
                System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 10.");
            }
        }

        if (i > 0) {
            double media = total / i;
            System.out.println("\nNotas computadas: " + i);
            System.out.printf("Média das notas: %.2f%n", media);
        } else {
            System.out.println("\nNenhuma nota válida foi inserida.");
        }

    }
}
