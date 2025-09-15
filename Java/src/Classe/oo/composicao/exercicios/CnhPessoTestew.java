package Classe.oo.composicao.exercicios;

import java.util.Scanner;

public class CnhPessoTestew {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = cin.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = cin.nextInt();
        cin.nextLine();
        System.out.println("Digite o registro da sua cnh: ");
        String reg = cin.nextLine();

        Pessoa p1 = new Pessoa(nome, idade, reg);

        p1.ExibirDadosPessoa();
        p1.cnh.exibirInfoCnh();

        cin.close();
    }
}
