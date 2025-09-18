package Desafios.Classe.SistemadeGestaodeCatalogodeCursos;

import Classe.oo.composicao.Curso;

import java.util.ArrayList;

public class Instrutor {
    final String nome;
    ArrayList <Curso> cursos = new ArrayList<>();

    Instrutor (String nome){

        this.nome = nome;

    }

    void adicionarCurso (Curso curso){

        cursos.add(curso);

    }

}
