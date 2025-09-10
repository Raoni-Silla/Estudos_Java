package Vetores;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        double as [] = {1,2,3,4};
        // quando voce quer percorrer o array todo passando por todos os elementos se usa o for each
        /*double a: Para cada elemento no array, o valor dele será temporariamente
         armazenado em uma nova variável chamada a,
         que também é do tipo double. as: Este é o array que você quer percorrer.*/
        double soma = 0;
        for (double a:as){
            //as[0]+= a; // somo todos os numeros do vetor na primeira posição do vetor, aqui ele altera o vetor original
            System.out.println(a);
            soma += a;


        }

        System.out.println(Arrays.toString(as));
        // transforma o vetor em uma string e imprime ela
        System.out.println(soma);
    }
}
