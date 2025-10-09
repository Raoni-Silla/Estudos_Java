package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("joao",7.1);
        Aluno aluno2 = new Aluno("maria", 8.4);
        Aluno aluno3 = new Aluno("pedro", 6.5);
        Aluno aluno4 = new Aluno("ana", 9.2);
        Aluno aluno5 = new Aluno("lucas", 5.8);
        Aluno aluno6 = new Aluno("carla", 7.9);
        Aluno aluno7 = new Aluno("rafael", 8.7);

        List<Aluno> alunos = Arrays.asList(aluno1,aluno2,aluno3,aluno4,aluno5,aluno6,aluno7);

        Predicate <Aluno> aprovado = a -> a.getNota() > 7;
        Function<Aluno,Double> nota = a -> a.getNota();
        BinaryOperator <Double> sum = (a,b) -> a + b;

        alunos.stream().filter(aprovado).map(nota).reduce(sum).ifPresent(System.out::println);

    }
}
