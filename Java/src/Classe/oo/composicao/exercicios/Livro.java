package Classe.oo.composicao.exercicios;

public class Livro {
    String titulo;
    String autor;


    Livro(String titulo, String autor){

        this.titulo = titulo;
        this.autor = autor;

    }

    void exibirDados (){

        System.out.printf("Titulo: %s", titulo);
        System.out.printf("Autor: %s", autor);

    }

}
