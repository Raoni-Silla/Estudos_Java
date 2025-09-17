package Classe.oo.composicao.DesafioRelacionamentos;

import java.util.ArrayList;

public class Compra {
    final ArrayList <Item> itens = new ArrayList<>();


    void adicionarItem (Produto p, int qntd){
        Item it = new Item(p,qntd);
        itens.add(it);
        System.out.println("item adicionado com sucesso!!");
    }

    double getValorTotal (){
        double total = 0;

        for (Item it : itens){

            total += it.qntd * it.produto.price;

        }

        return total;
    }

}
