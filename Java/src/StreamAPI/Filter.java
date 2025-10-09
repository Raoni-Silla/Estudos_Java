package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("carlos", 1.8);
        Aluno a2 = new Aluno("jujubs", 2.8);
        Aluno a3 = new Aluno("ana", 7.1);
        Aluno a4 = new Aluno("luisa", 5.8);
        Aluno a5 = new Aluno("livia", 10.0);
        Aluno a6 = new Aluno("gabrielly", 9.8);

        List<Aluno> lista = new ArrayList<>();
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        lista.add(a5);
        lista.add(a6);
        Consumer <Object> println = System.out::println;

        Predicate <Aluno> aprovado = a -> a.getNota() >= 7;
        Function <Aluno, String> saudacaoAprovado = a -> "Parabéns!! " + a.getNome() + " foi aprovado";
        lista.stream()
                .filter(aprovado)
                .map(saudacaoAprovado)
                .forEach(println);

    }
}
