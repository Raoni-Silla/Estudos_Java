package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        //lifo
        Deque <String> livros = new ArrayDeque<>();
        livros.add("o pequeno principe");//retorna verdadeiro ou falso
        livros.push("lord of the rings");
        livros.push("hobbit");

        System.out.println(livros.element());
        System.out.println(livros.peek());//<- retorna o ultimo elemento que entrou

        System.out.println(livros.poll());
        System.out.println(livros.remove());
        System.out.println(livros.pop());//joga uma excessão caso n tenha elemento na pilha pra tirar


        System.out.println(livros.size());

        System.out.println(livros.contains("bob"));


        for(String livro: livros){//faz do topo da pilha ate embaixo, o for sempre faz na ordem que esses elementos saem da estrutura
            System.out.println(livro);
        }
    }
}
