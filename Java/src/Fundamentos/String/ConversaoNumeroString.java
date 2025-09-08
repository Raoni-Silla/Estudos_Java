package Fundamentos.String;

public class ConversaoNumeroString {


    public static void main(String[] args) {
        // ocorre pra todos os tipos de wrapper, se converte assim numero > string
        Integer n1 = 10000; // usa wrapper pra acessar os metodos do n1

        System.out.println(n1.toString().length());
        int n2 = 10000;
        System.out.println(Integer.toString(n2)); // funciona da mesma forma que o de cima, tranforma o int em seu wrapper e depois converte pra string cm to string

    }
}
