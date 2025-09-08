package Fundamentos.String;

import java.util.Scanner;

public class ComparacaoString {
    public static void main(String[] args) {
        System.out.println("2" == "2"); // esse resultado da verdadeiro
        String s = "2";
        System.out.println("2" == s); //aqui da falso
        System.out.println("2".equals(s)); // aqui comapara o conteudo que esta dentro de 2 com a string 2 digitada dentro de aspas

        Scanner cin = new Scanner(System.in);

        String s2 = cin.nextLine();
        System.out.println("2".equals(s2.trim()) ); // tira os espaços em brancos trim, e o equals compara o conteudo e nao o tipo, quando se compara strings use o equal e nao o igual



        cin.close();
    }
}
