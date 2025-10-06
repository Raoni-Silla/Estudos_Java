package Lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        //parametro de entrada integer e retorna uma string
        Function<Integer, String> funcao =
                numero -> numero % 2 == 0 ? "par" : "impar";



        Function<String, String> funcao2 =
                numero -> "O resultado é ";

        System.out.println(funcao.andThen(funcao2).apply(5));
        //resolve primeiro o appply e depois chama o andthen com oque a funcao 2 faz
        //quanto maior a função mais dificil fica a reutilização do codigo
        //quando se tem micro funções
    }
}
