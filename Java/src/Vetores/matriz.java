package Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Quantos alunos: ");
        int qtdAlunos = cin.nextInt();

        System.out.println("Quantas notas por aluno: ");
        int qntdnotas = cin.nextInt();

        double [] [] notasTurma = new double[qtdAlunos][qntdnotas];
        double total = 0;

        for (int i = 0; i < notasTurma.length; i++){
            for (int j = 0; j < notasTurma[i].length; j++) {

                System.out.printf("informe a nota do %d do aluno %d", i + 1,j + 1);
                notasTurma [i] [j] = cin.nextDouble();
                total +=notasTurma [i] [j];

            }
        }

        double media = total / (qtdAlunos * qntdnotas);
        System.out.printf("media da turma é %.2f", media);


        for (double [] notasAluno : notasTurma){
            System.out.println(Arrays.toString(notasAluno));
        }
    }
}
