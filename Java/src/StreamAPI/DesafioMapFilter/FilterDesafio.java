package StreamAPI.DesafioMapFilter;

import java.util.Arrays;
import java.util.List;

public class FilterDesafio {
    public static void main(String[] args) {

        Produto prod1 = new Produto("Playstation", 3.500);
        Produto prod2 = new Produto("Xbox", 2.500);
        Produto prod3 = new Produto("Switch", 2.300);
        Produto prod4 = new Produto("Notebook Basico", 1.200);
        Produto prod5 = new Produto("Apple pod", 3.600);
        Produto prod6 = new Produto("Iphone 13", 5.500);

        List<Produto> produtos = Arrays.asList(prod1,prod2,prod3,prod4,prod5,prod6);



    }
}
