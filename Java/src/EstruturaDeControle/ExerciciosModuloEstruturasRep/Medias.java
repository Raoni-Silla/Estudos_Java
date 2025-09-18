package EstruturaDeControle.ExerciciosModuloEstruturasRep;

import javax.swing.*;
import java.util.Scanner;

/**
 * Criar um programa que receba duas notas parciais,
 * calcular a média final.
 * Se a nota do aluno for maior ou igual a 7.0
 * imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console
 * "Recuperação",
 * caso contrário imprime no console "Reprovado".
 */
public class Medias {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
       var n1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
       var n2 = JOptionPane.showInputDialog("Digite a segunda nota: ");

       Integer nota1 = Integer.parseInt(n1);
       Integer nota2 = Integer.parseInt(n2);

       double media = (nota1 + nota2) / 2f;

       if (media >= 7 ){
           System.out.printf("Parabéns!!, sua media %.2f foi o suficiente pra ser aprovado", media);
       } else if (media >= 4 && media <= 7 ) {
           System.out.printf("Infelizmente com a media %.2f ficara de recuperação",media);

       }else {
           System.out.printf("Reprovado!! media %.2f abaixo da desejada");
       }


        cin.close();
    }
}
