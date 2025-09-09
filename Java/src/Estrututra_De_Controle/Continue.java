package Estrututra_De_Controle;

public class Continue {
    public static void main(String[] args) {
        int i = 0;
        for (;i < 10; i++){

            if (i % 2 == 1){
                continue; // o continue joga para a proxima iteração? o break gera uma interrupção e o continue interrompe apenas a iteração
            }
            System.out.println(i);
        }

    }
}
