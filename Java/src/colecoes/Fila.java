package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {


        Queue <String> fila = new LinkedList<>();
        //offer e add -> adicionam elementos na fila
        //divergem no comportamento quando a fila ta cheia

        fila.add("ana"); //gera um erro se tiver uma fila com tamanho predefinido
        fila.offer("Bia");//retorna falso se nao conseguir adicionar a fila


        //obtem o proximo elemento da fila sem remover
        System.out.println(fila.peek());//ele le o elemento da fila
        System.out.println(fila.element());// ele retorna o valor e nao apaga
        //oque diverge os dois acima ocorre quando a fila ta vazia
        //o peek retorna nulo quando n tem ngm na fila
        // ja o element da erro e retorna que nao existe elemento fila

        //.add() lançará uma exceção caso a fila esteja cheia.
        //
        //.offer() retorna falso caso a fila esteja cheia.

        System.out.println(fila.isEmpty());
        //  fila.size()
        //fila.clear
        //fila.contains

        //ocorre quando a fila ta vazia
        System.out.println(fila.remove()); //lança uma excessão
        System.out.println(fila.poll());//retorna o primeiro elemento da fila ja removendo



    }
}
