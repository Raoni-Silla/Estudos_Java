package EstruturaDeControle;

import java.util.Scanner;

public class EstruturaIf {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Informe a media: ");
        double nota = cin.nextDouble();

        if (nota >= 7.0){
            System.out.println("aprovado");
        }else{
            System.out.println("reprovado");
        }

        cin.close();
    }
}
