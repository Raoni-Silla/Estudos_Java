package Classe.oo.composicao;

import TreinoOrganizacaoPacotes.Pessoa.Aluno;

import java.util.ArrayList;

public class Curso {
    final String nome;
    final ArrayList <ALuno> alunos = new ArrayList<>();
   // um curso tem um nome e uma lista de alunos

    Curso (String nome){
        this.nome = nome;
    }

    void adicionarAL (ALuno aluno){
        //nao entendi essas chamadas
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}
