package Generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa <String> caixa = new Caixa <>();
        caixa.guardar("Secret");
        System.out.println(caixa.AbrirCaixa());

    }
}
