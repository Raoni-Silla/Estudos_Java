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

    @Column(nullable = false)
    private int qntd;

    @Column(nullable = false)
    private Double price;

    @ManyToOne //many do lado da classe anotada, one do lado da classe referenciada
    private Pedido pedido;

    @ManyToOne
    private ProdutosJava produtos;

    //varios itens de pedido tem um pedido?


    public ItemPedido(){}
    public ItemPedido(int qntd, Pedido pedido, ProdutosJava produtos) {
        setQntd(qntd);
        setPedido(pedido);
        setProdutos(produtos);
    }

    public void setProdutos(ProdutosJava produtos) {
        this.produtos = produtos;
        if (produtos != null && this.getPrice() == null) {
            this.setPrice(produtos.getPreco());
            //aqui eu seto o preço do produto apartir do atributo preco do produto
        }
    }
}
