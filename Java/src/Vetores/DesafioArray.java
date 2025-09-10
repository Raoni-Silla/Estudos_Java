package Vetores;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);



        System.out.println("digite quantas notas deseja informar: ");
        int informados = cin.nextInt();
        double notas [] = new double[informados];

        for (int i = 0; i < informados; i++){

            System.out.printf("Digite a nota [%d]: ", i + 1);
            notas[i] = cin.nextDouble();

        }

        double soma = 0;
        for (double nota: notas){
            soma += nota;
        }

        System.out.printf("a media de todas as notas digitadas é %.2f",soma/informados);


        cin.close();
    }
}
