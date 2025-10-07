package Lambdas.Desafio;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Product p1 = new Product("Playstation",4500.0);
        Product p2 = new Product("Xbox",3500.0);

        Function <Product,Double> discountFunction = x -> x.getPrice() * (1 - Product.discount) ;
        Function <Double, Double>  TaxFunction = x -> x >= 2500 ? x * (1 + 0.085): x;
        UnaryOperator<Double> Freight = x -> x >= 3000 ? x + 100 : x + 50;
        Function <Double, Double> Arround = x -> Math.round(x * 100.0) / 100.0;
        Function <Double, String> Format = x -> x.toString().replace(".", ",");
        System.out.println("Preço do p1 com desconto da loja R$: " + discountFunction
                .andThen(TaxFunction).
                andThen(Freight).
                andThen(Arround).
                andThen(Format).
                apply(p1));

        System.out.println("Preço do p2 com desconto da loja R$: " + discountFunction.
                andThen(TaxFunction).
                andThen(Freight).
                andThen(Arround).
                andThen(Format).
                apply(p2));

    }
}
