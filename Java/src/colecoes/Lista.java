package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        // crio uma list, vinculada ao tipo usuario, instancio essa lista(objeto)
        List<User> lista = new ArrayList<>();
        //instancio os objetos que essa lista vai guardar:
        User u1 = new User("pedro");
        lista.add(u1);
        lista.add(new User("bia"));
        lista.add(new User("carlos"));
        lista.add(new User("mary"));
        lista.add(new User("luisa")); //posso instanciar o objeto ja dentro da lista

        //obter elemento id  2          montei um to string especifico
        System.out.println(lista.get(2).toString()); //acessar pelo indice


        for (User u: lista){
            System.out.println(u); //to string fica implicito pra imprimir valores no console
        }

        lista.remove(1); //remover pelo indice na lista
        lista.remove(new User("luisa"));// remover pelo nome

        System.out.println(lista.contains(new User("mary"))); //contem o usuario x?
        //sempre usar new user antes de usar metodos

        for (User u: lista){
            System.out.println(u); //to string fica implicito pra imprimir valores no console
        }

    }
}
