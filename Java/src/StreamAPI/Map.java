package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        Consumer<Object> println = System.out::println;

        List<String> marcas = Arrays.asList("mercedes","honda","bmw","hiunday","ferrari","bid","gtr","suv","corolla");

        marcas.stream(); //operação de built

        marcas.stream().map(m -> m.toUpperCase()).forEach(println); //for each é termianal
        //peguei as marcas, joguei pra maiusculo e depois imprimi
        UnaryOperator <String> maiscula = n -> n.toUpperCase();
        UnaryOperator <String> primeiraLetra = n -> n.charAt(0) + "";
        UnaryOperator <String> grito = n -> n + "!!!!";
        marcas.stream()
                .map(maiscula)
                .map(primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(println);

        //posso fazer uma composição em cima de uma coleção de dados

    }
}
