package Vetores;

import java.util.Arrays;

public class exercicio {
    public static void main(String[] args) {

        double notasAlunoA [] = new double[3];
        notasAlunoA [0] = 10;
        notasAlunoA [1] = 3;
        notasAlunoA [2] = 7.4;

        System.out.println(Arrays.toString(notasAlunoA)); //retorna o array em uma string
        double total = 0;
        for (int i = 0; i < notasAlunoA.length; i++){ // aqui ele diz que enquanto i for menor que todos os itens do array ele continua
            total += notasAlunoA[i];
        }

        System.out.println(total/3);


        double notasAlunoB [] = {10, 9.9, 5.5, 10}; //inicializei de forma literal os valores no array
        double total2 = 0;
        for (int i = 0; i < notasAlunoB.length; i++) { //aqui length é um atributo e nao um comportamento

            total2 += notasAlunoB[i];

        }

    }
}
