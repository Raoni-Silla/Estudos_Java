package Desafios;

public class ConversaoTemperatura {
    public static void main(String[] args) {

        double farnheit = 86;
        final int AJUSTE = 32;
        // quando se faz uma divisão de numeros inteiros o resultado sempre vem inteiro, agora com casas decimais o resultado tbm vem com casas decimais
        final double FATOR = 5/9.0;
        // (°f - 32) * 5/9
        double celsius = (farnheit - AJUSTE) * FATOR;
        System.out.println("A conversão de 40f° pra celsius é " + celsius);

    }
}
