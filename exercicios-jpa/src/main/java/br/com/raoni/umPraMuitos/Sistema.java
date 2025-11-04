package br.com.raoni.umPraMuitos;

import br.com.raoni.ModeloBasico.ProdutosJava;
import br.com.raoni.infra.DAO;

import java.util.Date;

public class Sistema {
    public static void main(String[] args) {

        DAO <Object> dao = new DAO<>();
        ProdutosJava prod = new ProdutosJava("GELADEIRA","ELETROLUX", 1999.9);
        Pedido pedido = new Pedido();
        ItemPedido item = new ItemPedido(2,pedido,prod);

        dao.abrirTransacao().incluir(prod).incluir(pedido).incluir(item).fecharTransacao();





    }
}
