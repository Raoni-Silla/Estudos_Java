package Classe.oo.composicao.DesafioRelacionamentos;

public class ClienteTeste {
    public static void main(String[] args) {

        Cliente cli1 = new Cliente("jonas");
        Compra c1 = new Compra();
        Compra c2 = new Compra();
        c1.addItem("caderno", 10, 10);
        c2.addItem("impressora", 200,2);

        cli1.adicionarCompra(c1);
        cli1.compras.add(c2);

        System.out.println(cli1.getValorTotalCliente());

    }
}
