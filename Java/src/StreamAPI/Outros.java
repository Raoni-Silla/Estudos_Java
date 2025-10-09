package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("joao",7.1);
        Aluno aluno2 = new Aluno("maria", 8.4);
        Aluno aluno3 = new Aluno("pedro", 6.5);
        Aluno aluno4 = new Aluno("ana", 9.2);
        Aluno aluno5 = new Aluno("pedro", 5.8);
        Aluno aluno6 = new Aluno("ana", 7.9);
        Aluno aluno7 = new Aluno("rafael", 8.7);

        List<Aluno> alunos = Arrays.asList(aluno1,aluno2,aluno3,aluno4,aluno5,aluno6,aluno7);

        System.out.println("Distinct(n pega valor duplicado)");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/limit");
        //ele vai pular dois elementos
        alunos.stream().skip(2).limit(3).forEach(System.out::println);

        System.out.println("TakeWhile, pega elementos até");
        alunos.stream().takeWhile(a->a.getNota() >=7).forEach(System.out::println);

    }
}
