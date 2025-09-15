package Classe.oo.composicao.exercicios;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livro> livros = new ArrayList<>();


    public void adicionarLivro (Livro livro){
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso!!!");
    }

    void exibirLivros (){
        for(Livro li : livros){
            System.out.println("livro: "+ li.autor + " / " + li.titulo);
        }
    }
}
