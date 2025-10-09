package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("joao",7.1);
        Aluno aluno2 = new Aluno("maria", 8.4);
        Aluno aluno3 = new Aluno("pedro", 6.5);
        Aluno aluno4 = new Aluno("ana", 9.2);
        Aluno aluno5 = new Aluno("lucas", 5.8);
        Aluno aluno6 = new Aluno("carla", 7.9);
        Aluno aluno7 = new Aluno("rafael", 8.7);

        List<Aluno> alunos = Arrays.asList(aluno1,aluno2,aluno3,aluno4,aluno5,aluno6,aluno7);

        Comparator <Aluno> melhorNota = (a1,a2) ->{
            if (a1.getNota() > a2.getNota()) {
                return 1;
            }else if (a1.getNota() < a2.getNota()) {
                return -1;
            }
            return 0;
            //uma função de comparação consegue ordenar uma lista apartir de determinados
            //criterios
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());
    }

}
