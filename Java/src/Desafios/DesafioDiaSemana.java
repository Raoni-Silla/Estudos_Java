package Desafios;

import javax.swing.*;
import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        String diaSemana = JOptionPane.showInputDialog("Digite o dia da semana: ");
    if (diaSemana.trim().equalsIgnoreCase("domingo")){

        System.out.printf("O dia da semana relacionado a %s é o numero %d :)",diaSemana,1);

    } else if (diaSemana.trim().equalsIgnoreCase("segunda")) {

        System.out.printf("O dia da semana relacionado a %s é o numero %d :)",diaSemana,2);

    } else if (diaSemana.trim().equalsIgnoreCase("terça")) {

        System.out.printf("O dia da semana relacionado a %s é o numero %d", diaSemana,3);

    } else if (diaSemana.trim().equalsIgnoreCase("quarta")) {
        System.out.printf("O dia da semana relacionado a %s é o numero %d", diaSemana,4);
    } else if (diaSemana.trim().equalsIgnoreCase("quinta")) {

        System.out.printf("O dia da semana relacionado a %s é o numero %d",diaSemana,5);

    } else if (diaSemana.trim().equalsIgnoreCase("sexta")) {

        System.out.printf("O dia da semana relacionado a %s é o numero %d",diaSemana,6);

    } else if (diaSemana.trim().equalsIgnoreCase("sabado")) {

        System.out.printf("O dia da semana relacionado a %s é o numero %d",diaSemana,7);
    }


    }
}
