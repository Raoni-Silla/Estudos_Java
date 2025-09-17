package Classe.oo.composicao.exercicios;

import java.util.ArrayList;

public class Autor {

    final String nome;
    ArrayList <Manga> mangas = new ArrayList<>();

    Autor (String nome){
        this.nome = nome;
    }

    void adicionarManga (Manga manga){

        this.mangas.add(manga);
        manga.autores.add(this);

        //aqui eu digo que o autor que chamar esse metodo, vai ter que abrir a lista dele de maga
        //e adicionar o novo manga a lista dele
        //depois disso que o manga que foi passado como parametro vai acessar a lista de autores que é um atributo dele
        //e adicionar o autor que chamou o metodo
    }

}
