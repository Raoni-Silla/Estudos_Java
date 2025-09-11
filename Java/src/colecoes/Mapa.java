package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map <Long, String> tableUsers = new HashMap<>();
        tableUsers.put( 1L,"roberto");
        tableUsers.put(2l,"ricardo");//serve pra incluir e pra substituir p valor da chave
        tableUsers.put( 3L,"lucas");

        System.out.println(tableUsers.size());
        System.out.println(tableUsers.isEmpty());

        System.out.println(tableUsers.keySet());//retorna todas as chaves , nem de forma ordenada ou numerica

        System.out.println(tableUsers.values());//passa os valores apenas

        System.out.println(tableUsers.entrySet());

        System.out.println(tableUsers.containsKey(1));//contem a chave 1²
        System.out.println(tableUsers.containsValue("carlos"));
        System.out.println(tableUsers.get(3)); //pega o elemento pela chave e retorna o valor


        //por chave
        for (Long chave:tableUsers.keySet()){
            System.out.println(chave);
        }

        //por valor
        for (String valor: tableUsers.values()){
            System.out.println(valor);
        }


        // por chave e valor
        for (Map.Entry <Long, String> registro: tableUsers.entrySet()){
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }

        //remove apartir da chave
        System.out.println(tableUsers.remove(1));
        //remove apartir do chave/valor
        System.out.println(tableUsers.remove(1,"carlos"));


    }
}
