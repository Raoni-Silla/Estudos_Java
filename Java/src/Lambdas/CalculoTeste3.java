package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {


        //defino o tipo, como double

        //nao: int -> double
        //double -> Double
        BinaryOperator <Double> soma = (a, b)->{return a+b;};

        //o binary operator faz o calculo de dois parametros  de tipos iguais e o
        //tipo de retorno é igual oque eu recebi
        System.out.println(soma.apply(1.0,2.0));

        soma = (x,y) -> x * y; //quando eu omito o par de chaves o

        //o apply seria como o executar na interface calculo
        System.out.println(soma.apply(1.0,2.0));
    }


}

