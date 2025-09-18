package Desafios.Classe.SistemadeGestaodeCatalogodeCursos;

import java.util.ArrayList;

public class Curso {

    String titulo;
    final Instrutor instrutor;
    final ArrayList <Aula> aulas = new ArrayList<>();
    final ArrayList <Aluno> alunos = new ArrayList<>();
    nivelDificuldade nivel;


    Curso (String titulo, Instrutor instrutor){

        this.titulo = titulo;
        this.instrutor = instrutor;

    }


    void adicionarAulas (Aula aula){

        this.aulas.add(aula);

    }

    void matricularAluno (Aluno aluno){

        this.alunos.add(aluno);
        aluno.cursosMatriculado.add(this);
    }


    void cargaHoraria (){
        int cargaHoraria = 0;

        for (Aula aul : aulas){

            cargaHoraria += aul.durMin;

        }

        System.out.printf("Carga horaria total %d", cargaHoraria);

    }



}
