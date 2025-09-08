package Estrututra_De_Controle;

import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int i = 0;
        do{
            System.out.println(i);
            i++;
        } while (10 >= i);


        cin.close();
    }

}
