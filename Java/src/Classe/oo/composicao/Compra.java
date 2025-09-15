package Classe.oo.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList <Item> items = new ArrayList<>();


    double getValorTotal (){
        double total = 0;

        for (Item item : items){
            total += item.qntd * item.preco;
        }

        return total;
    }

}
