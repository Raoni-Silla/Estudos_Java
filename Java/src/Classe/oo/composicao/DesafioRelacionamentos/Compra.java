package Classe.oo.composicao.DesafioRelacionamentos;

import java.util.ArrayList;

public class Compra {
   final  ArrayList <Item> itens = new ArrayList<>();


    void addItem (Produto p, int qntd) {
        this.itens.add(new Item(p, qntd));
    }
    void addItem (String nome, double preco, int qntd) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qntd));
    }
    double getValorTotal (){

        double valortotal = 0;

        for (Item item : itens) {
             valortotal += item.qntd * item.produto.preco;
        }

        return valortotal;

    }

}
