package EstruturaDeControle;

import java.util.Scanner;

public class EstruturaWhile02 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        String valor = " ";

        while (!valor.equalsIgnoreCase("sair")) // while é melhor pra valores indeterminados para o fim da execuçã0
        {

            System.out.println("digite uma palavra");
            valor = cin.nextLine();

        }




        cin.close();
    }
}
