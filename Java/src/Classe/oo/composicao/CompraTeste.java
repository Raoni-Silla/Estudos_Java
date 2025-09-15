package Classe.oo.composicao;

public class CompraTeste {

    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "junior";
        c1.items.add(new Item("caneta", 20, 7.50));
        c1.items.add(new Item("borracha", 2, 1.50));
        System.out.println(c1.items.size());
        System.out.println(c1.getValorTotal());

    }
}
