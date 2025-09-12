package Vetores.ExFixacao;

public class TabuleirodeBatalhaNaval {
    public static void main(String[] args) {

        char [][] tabuleiro = new char[5][5];



        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length ; j++) {

                tabuleiro [i] [j] = '~';
               


            }
        }

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length ; j++) {


                System.out.println(tabuleiro[i] [j]);

            }
        }


    }
}
