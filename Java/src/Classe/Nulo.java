package Classe;

public class Nulo {
    public static void main(String[] args) {
        String s1 = " ";// essa variavel s1 tem um endereço de memeoria, mesmo o valor sendo vazio
        System.out.println(s1.concat("!!!!"));

        // String s2;   ele nao deixa usar a string s2 assim pq ela nao foi inicializada
        String s2 = null;

        System.out.println(s2.concat("!!!"));
    }
}
