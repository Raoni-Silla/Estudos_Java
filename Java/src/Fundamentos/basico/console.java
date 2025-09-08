package Fundamentos.basico;

import java.util.Scanner;

public class console {
    public static void main(String[] args) {
        System.out.print("nao cria uma nova linha o print");
        System.out.println("cria uma nova linha");// ele vai ficar na mesma linha do print, pois o ln so quebra a linha depois do carregamento do que ela vai printar no console
        System.out.printf("mega %d %d %d %n", 1, 2, 3);//print formatado para usar caracteres especiais que substituem os valores pos virgula em sequencia
        // o %n quebra a linha na string formatada
        Scanner entrada = new Scanner(System.in);// o System.in diz que o scanner pra entrada de dados "entrada" vai pegar os dados de entrada, vai escanear oque foi digitado
        // o scanner precisa receber dentro dos parenteses qual entrada ele vai analisar, o in le o teclado
        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println(nome);
        System.out.println("Digite o sua idade: ");
        int idd = entrada.nextInt();    // pega o proximo inteiro
        System.out.println(nome);
        System.out.printf("%d", idd);
        entrada.close();

    }
}
