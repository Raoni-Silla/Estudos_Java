package Classe.oo.composicao.DesafioRelacionamentos;

public class Item {
    final Produto produto;
    final int qntd;

    Item (Produto produto, int qntd){
        this.produto = new Produto(produto.name, produto.price);
        this.qntd = qntd;
    }
}
