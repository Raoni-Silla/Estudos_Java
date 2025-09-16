package Classe.oo.composicao;

import java.util.ArrayList;

public class ALuno {
    // aluno tem um nome e uma lista de cursos
    final String nome;
    final ArrayList<Curso> cursos =new ArrayList<>();

    //quando é dito que a lista é final, uma constante, ele só nao vai permitir mudar no endereço de memoria pra onde a lista a ponta
    //sendo constante apenas o endereço da lista, mas nao seu conteudo

    ALuno(String nome){
        this.nome = nome;

    }

    void adicionarCurso (Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
}
