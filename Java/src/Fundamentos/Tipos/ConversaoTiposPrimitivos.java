package Fundamentos.Tipos;

public class ConversaoTiposPrimitivos {
    public static void main(String[] args) {
        // double > int
        double a = 1; // aqui houve uma conversão implicita de um inteiro indo pra um ponto flutuante
        // conversão explicita de double pra float
        //o cast voce diz pro java que esta ciente que pode perder informação
        float b = (float)1.0; //o literal é do tipo double, entao tem que especificar colocando a letra f ou fazendo cast

        int c = 5;
        byte d = (byte)c;
    }
}
