package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBi {
    public static void main(String[] args) {

        BinaryOperator<Double> media = (a,b)-> (a*b)/2 ;


        //se eu quero receber duas notas e retornar o status aprovado ou reprovado

        BiFunction<Double,Double,Double> ResultadoMedia = (n1,n2) ->
                (n1 + n2) / 2;


        System.out.println(ResultadoMedia.apply(9.7,4.1));

        Function <Double, String> conceito = m -> m>=7 ? "Aprovado" : "Reprovado";
        System.out.println(media.andThen(conceito).apply(9.7,4.1));
    }

}
