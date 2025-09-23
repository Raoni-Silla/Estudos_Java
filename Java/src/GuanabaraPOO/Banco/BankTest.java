package GuanabaraPOO.Banco;

import javax.swing.*;
import java.util.Scanner;

public class BankTest {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        System.out.println("Deseja abrir uma conta nova?");
        System.out.println("1-sim/2-não");
        byte opt = cin.nextByte();

        if (opt == 1){

            System.out.println("===========================================================");
            System.out.println("\nSeja bem vindo ao cadastro de novas contas correntes: ");
            String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
            String idadeS = JOptionPane.showInputDialog("Digite sua idade:" );
            String tipo = JOptionPane.showInputDialog("Digite o tipo da conta: ");
            int idade = Integer.parseInt(idadeS);
            CurrentAccount account = new CurrentAccount(new Owner(nome, idade),tipo);
            account.openAccount();

            System.out.println("=================================================");
            System.out.println("Exibindo dados:");
            System.out.println("\nId da conta "+ account.getIdAccount());
            System.out.println("Nome: " + account.getOwner().getName());
            System.out.println("Saldo Disponivel: " + account.getSaldo());
            System.out.println("Status da conta: " + account.isStatus());


            System.out.println("digite o valor do primeiro deposito: ");
            double value = cin.nextDouble();
            account.depositar(value);


            System.out.println("SALDO ATUAL: " + account.getSaldo());

            System.out.println("faça seu primeiro saque: ");
            double valueSaq = cin.nextDouble();
            account.sacar(valueSaq);

            System.out.println("SALDO ATUAL: " + account.getSaldo());


        }else System.out.println("encerrando cadastro");











        cin.close();
    }

}
