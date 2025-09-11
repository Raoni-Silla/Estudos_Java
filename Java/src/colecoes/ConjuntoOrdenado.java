package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoOrdenado {
    public static void main(String[] args) {
        // uma vez que eu defino desse lado o tipo que quero colocar
        //do outro lado da igualdade posso so por o prador diamond, lidando com o mesmo tipo
        SortedSet<String> lista = new TreeSet<>();// nao misture dados dentro de um set
        //<isso define o tipo da lista obrigatoriamente do tipo string>

        lista.add("ola");
        //eu settei dentro de <> os tipos de dados que eu quero guardar dentro dessa lista

        //é um HASHsett e esse hashset nao obdece a ordem de ordenação
        //podendo ter a possibilidade dele ser ordenado
        //tendo que usar um treeset, garantindo a ordem de entrada

        //<generics>
        for (String candidato: lista){
            System.out.println(candidato);
        }

    }
}
