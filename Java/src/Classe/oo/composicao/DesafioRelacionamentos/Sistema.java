package Classe.oo.composicao.DesafioRelacionamentos;

public class Sistema {
    public static void main(String[] args) {
        // criação do objeto cliente 1
        Cliente c1 = new Cliente("Nieztche");

        //criacção dos objetos de compra
        Compra cmp1 = new Compra();
        Compra cmp2 = new Compra();

        //aqui eu acesso o metodo adc item dentro de compra, e crio um novo produto pra ser adicionado
        cmp1.adicionarItem(new Produto("Xbox",2.500 ), 2);
        cmp1.adicionarItem(new Produto("Playstation",3.000 ), 1);

        cmp2.adicionarItem(new Produto("Switch",2.500 ), 2);
        cmp2.adicionarItem(new Produto("3ds",3.000 ), 1);


        c1.adicionarCompra(cmp1);
        c1.adicionarCompra(cmp2);

       double total = c1.getvalorTotalCli();

        System.out.printf("cliente: %s |Valor total das listas de compras: %f", c1.nome, total);
    }
}
