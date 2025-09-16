package Classe.oo.composicao;

public class Curso_teste {
    public static void main(String[] args) {

        ALuno aluno1 = new ALuno("jon");
        ALuno aluno2 = new ALuno("mary");
        ALuno aluno3 = new ALuno("peter");


        Curso curso1 = new Curso("Ads");
        Curso curso2 = new Curso("eng stfw");
        Curso curso3 = new Curso("bcc");

        curso1.adicionarAL(aluno1);
        curso1.adicionarAL(aluno2);

        curso2.adicionarAL(aluno2);
        curso2.adicionarAL(aluno3);

        aluno2.adicionarCurso(curso3);
        aluno1.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (ALuno aluno:curso3.alunos){
            System.out.println(aluno.nome);
        }


        System.out.println( aluno1.cursos.get(0).alunos);

        Curso cursoEncontrado = aluno1.obterCursoNome("ads");




    }
}
