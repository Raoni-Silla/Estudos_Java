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

    double getValorTotalCliente(){

        double valortotal = 0;


            for (Compra c : compras) {
                valortotal += c.getValorTotal();
            }

            return valortotal;

    }

}
