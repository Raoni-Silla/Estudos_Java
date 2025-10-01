package Lambdas;

import java.util.ArrayList;
import java.util.List;

public class ForEach {


    public static void main(String[] args) {
        List <String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Bia");
        lista.add("Car");
        lista.add("Dan");
        System.out.println("Forma tradicional");

        for(String s: lista){
            System.out.println(s);
        }

        System.out.println("Lambda:");

        lista.forEach((nome) -> {
            System.out.println("nome: "+nome + " !!!");
        }); //eu digo que na lista, ele vai fazer um for each, aonde cada item da lista
        //vai se chamar nome, e aponto pra logica que ele vai fazer, que é o sout


        System.out.println("\nMethod reference");

        lista.forEach(System.out::println);
        //passo uma referencia pra essa função
        //quanto menos codigo eu digitar, acaba que fica menos legivel
        //chama o foreach atraves da notação ponto
        //vai dar um sout (mostrar no console) e vai printar

        //lista para cada item na lista, imprima na saida do sistema


    }
}
