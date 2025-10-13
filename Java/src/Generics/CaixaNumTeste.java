package Generics;

public class CaixaNumTeste {
    public static void main(String[] args) {
        CaixaNumero <Double> caixa = new CaixaNumero<>();
        CaixaNumero <Integer> caixa2 = new CaixaNumero<>();

        caixa.guardar(2.0);
        caixa2.guardar(1);


    }
}
