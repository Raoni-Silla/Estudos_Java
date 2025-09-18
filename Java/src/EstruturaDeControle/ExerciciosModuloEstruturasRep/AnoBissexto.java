package EstruturaDeControle.ExerciciosModuloEstruturasRep;

import javax.swing.*;
import java.util.Scanner;

/**
 * criar um programa que leia um ano e verifica se esse ano é bissexto
 */
public class AnoBissexto {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        String ano = JOptionPane.showInputDialog("Digite um ano qualquer: ");

        //conversão
        Integer anoConvertido = Integer.parseInt(ano);

        //verifica divisel 4
        if (anoConvertido % 4 == 0){
            System.out.printf("O ano digitado é bissexto: %d ", anoConvertido);
        }else {
            System.out.printf("O ano digitado não é bissexto: %d ", anoConvertido);
        }

        cin.close();
    }
}
