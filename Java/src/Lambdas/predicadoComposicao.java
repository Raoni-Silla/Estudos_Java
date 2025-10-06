package Lambdas;

import java.util.function.Predicate;

public class predicadoComposicao {

    public static void main(String[] args) {
        //uma interface funcional que recebe uma entrada e retorna um boolean

        Predicate<Integer> p1 = x -> x % 2 == 0;
        Predicate<Integer> p2 = x -> x >=100 && x <= 999;

        System.out.println(p1.and(p2).test(22));
        //faz uma comparação entre p1 e p2 e retorna true ou false
        System.out.println(p2.or(p2).test(22));
        //sendo uma das duas verdadeiras é verdadeira

    }

}
