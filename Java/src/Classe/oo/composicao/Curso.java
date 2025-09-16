package Classe.oo.composicao;

import TreinoOrganizacaoPacotes.Pessoa.Aluno;

import java.util.ArrayList;

public class Curso {
    final String nome;
    final ArrayList <ALuno> alunos = new ArrayList<>();


    Curso (String nome){
        this.nome = nome;
    }

    void adicionarAL (ALuno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}
