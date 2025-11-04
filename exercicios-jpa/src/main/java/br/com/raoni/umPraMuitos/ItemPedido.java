package br.com.raoni.umPraMuitos;

import br.com.raoni.ModeloBasico.ProdutosJava;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int qntd;

    private Double price;

    @ManyToOne //many do lado da classe anotada, one do lado da classe referenciada
    private Pedido pedido;

    @ManyToOne
    private ProdutosJava produtos;

    //varios itens de pedido tem um pedido?


    public ItemPedido(){}
    public ItemPedido(int qntd, Double price, Pedido pedido, ProdutosJava produtos) {
        setQntd(qntd);
        setPrice(price);
        setPedido(pedido);
        setProdutos(produtos);
    }

    public void setProdutos(ProdutosJava produtos) {
        if (produtos != null && this.getPrice() == null) {
            this.setPrice(produtos.getPreco());
            //aqui eu seto o preço do produto apartir do atributo preco do produto
        }
    }
}
