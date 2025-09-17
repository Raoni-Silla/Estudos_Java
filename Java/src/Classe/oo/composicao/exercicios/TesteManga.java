package Classe.oo.composicao.exercicios;

public class TesteManga {
    public static void main(String[] args) {

        Autor aut1 = new Autor("Kafka");
        Autor aut2 = new Autor("Nieztche");

        Manga mg1 = new Manga("Attack on titan");
        Manga mg2 = new Manga("Blue lock");
        Manga mg3 = new Manga("Gachiakutta");

        aut1.adicionarManga(mg1);
        aut2.adicionarManga(mg1);
        aut1.adicionarManga(mg3);

        for(Manga mang : aut1.mangas){

            System.out.println("os livros de autor1 é: ");
            System.out.println("\n" + mang.titulo);

        }

        for(Autor aut : mg1.autores){

            System.out.println("os autores de manga 1 é ");
            System.out.println("\n" + aut.nome);

        }


    }
}
