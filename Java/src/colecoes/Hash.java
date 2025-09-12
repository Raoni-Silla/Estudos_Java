package colecoes;

import Classe.Usuarios;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet  <User> usuarios = new HashSet<>();

        usuarios.add(new User("cadete"));
        usuarios.add(new User("edurado"));
        usuarios.add(new User("livia"));

        System.out.println(usuarios.contains(new User("livia")));

    }
}
