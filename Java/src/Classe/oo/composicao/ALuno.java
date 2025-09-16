package Classe.oo.composicao;

import java.util.ArrayList;

public class ALuno {
    final String nome;
    ArrayList<Curso> cursos =new ArrayList<>();

    ALuno(String nome){
        this.nome = nome;

    }

    void adicionarCurso (Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
}
