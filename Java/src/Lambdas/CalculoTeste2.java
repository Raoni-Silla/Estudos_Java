package Lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {

        Calculo soma = (a,b)->{return a+b;}; //funcao anonima soma
        //se eu coloquei corpo a função preciso do retorno
        System.out.println(soma.executar(1,2));

        soma = (x,y) -> x * y; //quando eu omito o par de chaves o
        // java entende que tem uma unica sentença de codigo e que ele
        // vai ser implicitamente retornado
        //nao posso ter mais de uma linha de codigo quando nao tem chaves
        System.out.println(soma.executar(1,2));

    }
}
