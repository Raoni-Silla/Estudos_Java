package ExerciciosModuloEstruturasRep;
import java.util.Random; // chama a biblioteca random
import java.util.Scanner;

/**
 * Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
 * Armazene um numero aleatório em uma variável. O Jogador tem 10
 * tentativas para adivinhar o número gerado. Ao final de cada
 * tentativa, imprima a quantidade de tentativas restantes,
 * e imprima se o número inserido é maior ou menor do que o número
 * armazenado.
 */
public class JogoAdivinhacao {
    public static void main(String[] args) {
        final int T = 1;
        Random gerador = new Random(); //instancia um novo objeto da classe random
        int numeroAleatorio = gerador.nextInt(101); // aqui usa um metodo da classe random que gera um numero inteiro no range de 100
        System.out.println(numeroAleatorio);
        System.out.println("--------------------------------------");
        System.out.println("Bem vindo ao jogo de adivinhação");
        System.out.println("--------------------------------------");
        Scanner cin = new Scanner(System.in);
        System.out.println("você tem 10 tentativas para adivinhar um numero inteiro entre 1 e 100...");
        System.out.println("o jogo começa agora");
        System.out.println("---------------------------------------");
        for (int i = 10; i >= T; i--){
            System.out.printf("tentativa %d ,adivinhe o numero entre 1 e 100:", i);
            int adivinhado = cin.nextInt();
            if (numeroAleatorio == adivinhado){
                System.out.println("Parabéns!!!, você acertou o numero aleatorio");
                System.out.printf("numero aleatorio: %d", numeroAleatorio);
                System.out.printf("\nnumero digitado: %d",adivinhado);
                System.out.printf("\nquantidade de tentativas: %d", i);
                break;
            } else if (numeroAleatorio < adivinhado) {
                System.out.println("o numero aleatorio é menor que o digitado..");
            } else if (numeroAleatorio > adivinhado) {
                System.out.println("\n o numero aleatorio é maior que o digitado");
            }
        }
    }
}
