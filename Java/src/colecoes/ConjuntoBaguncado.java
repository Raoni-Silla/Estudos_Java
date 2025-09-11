package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawtypes", "uncheked"})// coloca uma observação para silenciar as advertencias
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        //adicionando valores a um conjunto set
        conjunto.add(1.2); //collections nao suporta tipo primitivo, entao automaticamento ele converte o tipo literal de double pra Double(wrapper)
        conjunto.add(true); // int -> Integer
        conjunto.add("teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("tamanho é : "+ conjunto.size()); //chama um metodo size pra dizer o tamanho do conjunto, nao tendo o .lenght

        conjunto.add("Teste");

        System.out.println("tamanho é : "+ conjunto.size()); //chama um metodo size pra dizer o tamanho do conjunto, nao tendo o .lenght

        conjunto.remove("teste"); // ele retorna false ou true, false se nao conseguir achar ou excluir e true se ele conseguir excluir

        System.out.println("tamanho é : "+ conjunto.size()); //chama um metodo size pra dizer o tamanho do conjunto, nao tendo o .lenght

        System.out.println("contem?[x]?"+ conjunto.contains('x')); //verifica se um elemento ta ou nao no conjunto


        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //unir os conjuntos:
        conjunto.addAll(nums); //tudo que tem em nums vai pra dentro de conjunto

        System.out.println(conjunto); //nao tem uma ordem de inclusao

        //intercessão
        conjunto.retainAll(nums);
        // ele junta os dois conjuntos, retendo oque tem no outro conjunto
        //de tal forma que o resultado vai ser apenas o valor em comum entre os conjuntos

        conjunto.clear();//limpa o conjunto
        System.out.println(conjunto);


    }
}
