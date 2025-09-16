package Classe.oo.composicao.DesafioRelacionamentos;

public class Item {
   final int qntd;
    final Produto produto;

    Item (Produto produto, int qntd){
        this.qntd = qntd;
        this.produto = produto;
    }
}
