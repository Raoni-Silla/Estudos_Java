package StreamAPI;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        //operacoes build
        //se eu quero pegar um sout print e atribuir isso a uma variavel
        //qual interface recebe um parametro e n retorna nada?
        Consumer<String> print = System.out::println;

        Stream<String> stream = Stream.of("A", "B", "C\n");
        stream.forEach(print);
        //stream .of é um metodo estatico que aloca recursos dentro da stream

        String [] maisLangs = {"python", "Lisp", "go", "pearl"};

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 2).forEach(print);

    }
}
