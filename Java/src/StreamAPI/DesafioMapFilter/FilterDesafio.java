package StreamAPI.DesafioMapFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterDesafio {
    public static void main(String[] args) {

        Produto prod1 = new Produto("Playstation", 3.500, 0.3, true);
        Produto prod2 = new Produto("Xbox", 2.500, 0.1, true);
        Produto prod3 = new Produto("Switch", 2.300, 0.4, false);
        Produto prod4 = new Produto("Notebook Basico", 1.200, 0.2, true);
        Produto prod5 = new Produto("Apple pod", 3.600, 0.1, false);
        Produto prod6 = new Produto("Iphone 13", 5.500, 0.022, true);

        List<Produto> produtos = Arrays.asList(prod1,prod2,prod3,prod4,prod5,prod6);
        Predicate <Produto> SuperDesconto = x -> x.getDesconto() > 0.3;
        Predicate <Produto> FreteGratis = Produto::isFreteGratis;
        Function <Produto, String> FormatarMensagem = prod ->
                    "Super Promoção! " +prod.getNome()+ " por apenas R$ "+
                    prod.getPreco() * (1 - prod.getDesconto()) +" !";

        Consumer <Object> println = System.out::println;

        produtos.stream()
                .filter(SuperDesconto)
                .filter(FreteGratis)
                .map(FormatarMensagem)
                .forEach(println);


    }
}
