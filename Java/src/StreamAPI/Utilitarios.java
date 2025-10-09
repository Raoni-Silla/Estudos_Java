package StreamAPI;

import java.util.function.UnaryOperator;

public class Utilitarios {
    //posso criar varias funções que fazem coisas simples
    public final static UnaryOperator<String> maiscula = n -> n.toUpperCase();
    public final static UnaryOperator <String> primeiraLetra = n -> n.charAt(0) + "";
    public final static UnaryOperator <String> grito = n -> n + "!!!!";

    public final static String grito (String str) {
        return str + "!!";
    }
}

