package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList <User> lista = new ArrayList<>();
        User u1 = new User("pedro");
        lista.add(u1);
        lista.add(new User("bia"));
        lista.add(new User("carlos"));
        lista.add(new User("mary"));
        lista.add(new User("luisa")); //posso instanciar o objeto ja dentro da lista

        //obter elemento id
        System.out.println(lista.get(3).toString()); //acessar pelo indice


        for (User u: lista){
            System.out.println(u);
        }

    }
}
