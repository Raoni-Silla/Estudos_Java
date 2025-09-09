package Classe;

import java.util.Scanner;

public class DataTeste {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        Data data1 = new Data();
        Data data2 = new Data();


            System.out.println("Digite o dia da primeira data:");
            data1.dia = cin.nextLine();
            System.out.println("Digite o mes da primeira data:");
            data1.mes = cin.nextLine();
            System.out.println("Digite o ano da  primeira data:");
            data1.ano = cin.nextLine();
            System.out.println("Digite o dia da segunda data:");
            data2.dia = cin.nextLine();
            System.out.println("Digite o mes da segunda data:");
            data2.mes = cin.nextLine();
            System.out.println("Digite o ano segunda data:");
            data2.ano = cin.nextLine();

        System.out.println("primeira data dia:"+ data1.dia + " do mes " + data1.mes + " do ano "+ data1.ano);
        System.out.println("segunda data dia:"+ data2.dia + " do mes " + data2.mes + " do ano "+ data2.ano);
        cin.close();
    }
}
