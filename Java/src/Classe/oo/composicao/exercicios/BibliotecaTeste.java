package Classe.oo.composicao.exercicios;

import javax.swing.*;
import java.util.Scanner;

public class BibliotecaTeste {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcao = 1;
        while (opcao == 1) {
            System.out.println("==========================================================\n");
            String titulo = JOptionPane.showInputDialog("Digite o titulo do autor");
            String autor = JOptionPane.showInputDialog("Digite o nome do autor: ");

            System.out.println("titulo: " + titulo + " autor: " + autor);
            System.out.println("Confirme os dados \n");
            System.out.println("Digite 1 pra confirmado 0 caso contrario");
            int opt = cin.nextInt();
            Livro livro = new Livro(titulo, autor);

            if (opt == 1) {

                biblioteca.adicionarLivro(livro);

            } else {
                System.out.println("finalizando processo.....");
            }

            System.out.println("Deseja continuar cadastrando livros?:");
            System.out.println("1-sim / 2-nao");
            opcao = cin.nextInt();
        }

            biblioteca.exibirLivros();

            cin.close();


    }
}
