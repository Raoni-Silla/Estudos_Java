package Lambdas.Desafio;

import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio {
    public static void main(String[] args) {
        Product p1 = new Product("Playstation",4500.0);
        Product p2 = new Product("Xbox",3500.0);


        Function <Product,Double> discountFunction = x -> x.getPrice() * (1- Product.discount) ;
        Function <Double, Double>  TaxFunction = x -> x >= 2500 ? x / (1 - 100): x;
        Function <Double, Double> Arround = x -> (double) Math.round(x);

        System.out.println("Preço do p1 com desconto da loja: " + discountFunction.andThen(TaxFunction).apply(p1));


    }
}
