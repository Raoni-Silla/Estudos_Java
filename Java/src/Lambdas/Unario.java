package Lambdas;

import java.util.function.UnaryOperator;

public class Unario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = x -> x + 2;
        System.out.println(maisDois.apply(1));
        UnaryOperator<Integer> multDois = x -> x * 2;
        System.out.println(multDois.apply(1));

        System.out.println(multDois.apply(2));

    }
}
