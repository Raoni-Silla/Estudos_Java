package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //se eu quiser somar todos os numeros da lista?
        //vou criar uma funçao que pode ser binaria, ou posso usar uma byfuntion
        BinaryOperator<Integer> op = (ac, n) -> ac + n;
        //pra pegar o resultado gerado usa a função get
        int total = lista.stream().reduce(op).get(); //resultado final de um reduce, terminal operator
        System.out.println(total);
        Integer total2 = lista.parallelStream().reduce(100,op);
        //quando eu tenho um valor integer que tem null, e quero associar essa variavel a outra int, posso ter uma exceção
        System.out.println(total2);
    }

}
