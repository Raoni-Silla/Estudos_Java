package GuanabaraPOO.Banco;

import javax.swing.*;
import java.util.Scanner;

public class BankTest {

    public static void main(String[] args) {

        System.out.println("Seja bem vindo ao cadastro de novas contas correntes: ");
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String idadeS = JOptionPane.showInputDialog("Digite sua idade:" );
        String tipo = JOptionPane.showInputDialog("Digite o tipo da conta: ");
        int idade = Integer.parseInt(idadeS);



        CurrentAccount account = new CurrentAccount(new Owner(nome, idade),tipo);
        System.out.println("=================================================");
        System.out.println("Exibindo dados:");
        System.out.println("\nId da conta "+ account.getIdAccount());
        System.out.println("Nome: " + account.getOwner());
        System.out.println("Saldo Disponivel: " + account.getSaldo());
        System.out.println("Status da conta: " + account.isStatus());
    }

}
