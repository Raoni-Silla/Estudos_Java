package Classe.oo.composicao.DesafioRelacionamentos;

import java.util.ArrayList;

public class Cliente {
    final String nome;
    final ArrayList <Compra> compras = new ArrayList<>();


    Cliente (String nome){
        this.nome = nome;
    }


    void adicionarCompra (Compra compra){
        this.compras.add(compra);
    }

    double getvalorTotalCli (){

        double soma = 0;

        for (Compra cmp : compras){
            soma += cmp.getValorTotal();
        }

        return soma;
    }
}
