package Lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        //aqui eu declaro uma variavel is caro do tipo da interface funcional predicate
        //ela recebe um valor generico e retorna true or false
        //uso de lambda para o encurtamento do codigo

        Predicate <Produto> isCaro = prod -> prod.getPreco() >= 750;

        //instancio um produto
        //chamo minha variavel que armazena a logica da interface funcional produto
        //e chamo o metodo test, que retorna se aquilo é true or false
        //e depois faço um if pra formatar a mensagem de acordo com a resposta do isCaro

        Produto produto = new Produto("notebook", 3000.0,0.15);
        System.out.println(isCaro.test(produto));
        if (isCaro.test(produto)) {
            System.out.println("produto caro");
        }else {
            System.out.println("produto nao caro");
        }
    }

}
