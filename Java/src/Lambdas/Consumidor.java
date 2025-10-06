package Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        //passa um parametro e n retorna absolutamente nada
        Consumer<Produto> imprimir = p -> System.out.println("Produto: " + p.getNome() + " !!!!");

        Produto produto1 = new Produto("caneta", 12.34,0.09);
        Produto produto2 = new Produto("lapis", 12.34,0.09);
        Produto produto3 = new Produto("lapiseira", 12.34,0.09);
        Produto produto4 = new Produto("tinta", 12.34,0.09);


        imprimir.accept(produto1);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        //for each espera receber um consumer, então da pra utilizar assim
        produtos.forEach(imprimir);

    }
}
