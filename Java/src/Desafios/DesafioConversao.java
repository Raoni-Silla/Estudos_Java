package Desafios;


import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String sal1, sal2, sal3;
        System.out.println("Digite seu salario do ultimo 3° mễs: ");
        sal1 = cin.nextLine();
        System.out.println("Digite o seu salario do penultimo mês: ");
        sal2 = cin.nextLine();
        System.out.println("Digite o seu salario do ultimo mês:");
        sal3 = cin.nextLine();

        sal1 = sal1.replaceAll(",", ".");
        sal2 = sal2.replaceAll(",", ".");
        sal3 = sal3.replaceAll(",", ".");

        double sc1 = Double.parseDouble(sal1);
        double sc2 = Double.parseDouble(sal2);
        double sc3 = Double.parseDouble(sal3);

        double soma = sc1 + sc2 + sc3;
        double media = soma/3;

        System.out.printf("O resultado da media dos seus 3 ultimos salarios é: %.3f",media);




    }
}
