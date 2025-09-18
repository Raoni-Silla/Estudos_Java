package Desafios.Classe.SistemadeGestaodeCatalogodeCursos;

import java.util.ArrayList;

public class Curso {

    String titulo;
    Instrutor instrutor;
    ArrayList <Aula> aulas = new ArrayList<>();
    ArrayList <Aluno> alunos = new ArrayList<>();
    nivelDificuldade nivel;


    Curso (String titulo, Instrutor instrutor){

        this.titulo = titulo;
        this.instrutor = instrutor;

    }


    void adicionarAulas (Aula aula){

        aulas.add(aula);

    }

    void matricularAluno (Aluno aluno){

        alunos.add(aluno);

    }


    void cargaHoraria (){
        int cargaHoraria = 0;

        for (Aula aul : aulas){

            cargaHoraria += aul.durMin;

        }

        System.out.printf("Carga horaria total %d", cargaHoraria);

    }



}
