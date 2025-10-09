package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        //operacoes build
        //se eu quero pegar um sout print e atribuir isso a uma variavel
        //qual interface recebe um parametro e n retorna nada?
        //o consumer é uma interface funcional que recebe um parametro e nao retorna anda

        Consumer<Object> print = System.out::println;
        //consigo atribuir uma referencia a um metodo a uma variavel print


        Stream<String> stream = Stream.of("A", "B", "C\n");
        //usar um metodo estatico pra criar uma stream de dados, o stream of e passo
        //oque essa stream vai guardar

        stream.forEach(print);
        //chamo o metodo forEach do objeto stream, e passo a referencia ao metodo sout
        //que eu guardei dentro de print, ai ele printa a lista de dados

        //stream .of é um metodo estatico que aloca recursos dentro da stream

        String [] maisLangs = {"python", "Lisp", "go", "pearl"};
        //posso criar uma stream de dados apartir de um array
        //delimito as chaves e preencho o vetor com os dados

        Stream.of(maisLangs).forEach(print);
        //chamo o metodo estatico stream of e passo o vetor mais langs pra transformar o array em stream
        //e depois encadeo um for each pq o stream of retorna uma stream
        Arrays.stream(maisLangs).forEach(print);
        //dentro de arrays existe um metodo chamado stream que eu posso passar um array
        Arrays.stream(maisLangs, 1, 2).forEach(print);
        //tenho a possibilidade alem de passar o array, posso passar um subconjunto dos arrays
        //ele vai do 1 até o indice 2, mas o 2 não é incluso

        //posso gerar uma stream apartir de collection

        List<String> outrasLangas = Arrays.asList("c", "c++","c#");
        outrasLangas.stream().forEach(print);
        outrasLangas.parallelStream().forEach(print);

        //tenho um metodo chamado generate que gera uma stream infinita
        //que nao tem uma ordenação
        //passo um supplier uma função que n recebe parametro e retorna algo
        Stream.generate(() -> " a ").forEach(print);

        //outra possibilidade de gerar uma stream infinta é uma forma ordenada

        Stream.iterate(0,n -> n + 1).forEach(print);
        //começa em 0, e pra cada iteração ele gera 0 + 1
        //na primeira vez o 0 passa pra n e ele imprime isso infinitamente


    }
}
