package Classe.oo.composicao.exercicios;

import java.util.ArrayList;

public class Manga {

    final String titulo;
    final ArrayList <Autor> autores = new ArrayList<>();

    Manga (String titulo){
        this.titulo = titulo;
    }

    void adicionarAutor(Autor autor){
        this.autores.add(autor);
        autor.mangas.add(this);
        // entao aqui eu falo, this(o manga que chamou o metodo, vamos chamar de aot)
        // entao aot chama o metodo de adicionar autor recebendo um autor como parametro
        //aot abre sua lista de autores this.autores, e pede pra adicionar o novo autor
        //passando como parametro e em baixo, eu pego esse autor e adiciono la lista desse
        // autor passado como parametro o nome do manga aot que ele esta escrevendo
    }

}
