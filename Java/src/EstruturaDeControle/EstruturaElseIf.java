package Estrututra_De_Controle;

import java.util.Scanner;

public class EstruturaElseIf {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = cin.nextDouble();

        if (nota > 10 || nota < 0){
            System.out.println("nota invalida");
        } else if (nota >= 8.0) {
            System.out.println("Parabens, Aprovado");
            System.out.println("Nota A+");
        } else if (nota <= 5) {
            System.out.println("estude mais, reprovado");
            System.out.println("nota F");
        }else {
            System.out.println("esta na media, aprovado");
            System.out.println("nota C");
        }

        cin.close();
    }
}
