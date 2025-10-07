package StreamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObject {
    public static void main(String[] args) {

        List <String> aproved = Arrays.asList("A", "B", "C");


        System.out.println("for normal");
        for(int i =0; i<aproved.size();i++){
            System.out.println(aproved.get(i));
        }

        System.out.println("for each");
        for (String nome:aproved){
            System.out.println(nome);
        }

        System.out.println("\n usando o iterator");

        //interface em java que retorna o valor verdadeiro ou falso
        //tem proximo?
        Iterator<String> iterator = aproved.iterator(); //retorna o iterador que percorre a lista
        while(iterator.hasNext()){ //tem proximo?, se tiver imprima ela e passe pro proximo elemento
            System.out.println(iterator.next());
        }
        //o fato de que a iteração ocorre de forma externa sem ter que codificar isso
        System.out.println("usando stream");
        //uma sequencia de dados
        Stream<String> stream = aproved.stream();
        stream.forEach(System.out::println);
        //eu abstraio parte da complexidade de ficar me preocupado se tem proximo
        //chamo uma função


    }
}
