package Desafios;

import javax.swing.*;
import java.util.Scanner;

public class DesafioCalculadoraUm {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        String n1 = JOptionPane.showInputDialog("Digite o primeiro numero");
        double numero1 = Double.parseDouble(n1); // converto n1 pra double

        System.out.println("Digite o segundo numero");
        double n2 = cin.nextDouble(); //leio com o scanner

        String opr = JOptionPane.showInputDialog ("Digite a operação desejada:(+,-,/,*): ");
        double resultado;
         resultado = "+".equals(opr) ? numero1 + n2 : 0;
         resultado = "-".equals(opr) ? numero1 - n2 : resultado; // aqui caso o resultado do ternario de cima seja 0, o resultado fica como 0, se nao fica como o resultado da adição e assim por diante
         resultado = "/".equals(opr) ? numero1 / n2 : resultado;
         resultado = "*".equals(opr) ? numero1 * n2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f",numero1,opr,n2,resultado);

        cin.close();







    }
}
