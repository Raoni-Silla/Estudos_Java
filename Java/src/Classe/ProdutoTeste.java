package Classe;

//import Estrututra_De_Controle.Break;


// classe que vamos usar , como estou dentro de um mesmo pacote, nao preciso importar a classe produto, sem precisar importar
public class ProdutoTeste {

    public static void main(String[] args) {
        //Break
       // Scanner cin = new Scanner(System.in);
        //tipo scanner com nome cin = construtor que tem o exato nome da classe, se eu quero criar uma classe do tipo produto tenho que chamar o construtor de produto
        Produto p1 = new Produto(); // instanciei um objeto produto de nome p1, com um construtor nao padrão que requer o nome
        var p2 = new Produto();//classe que tem duas instancias independentes
       // p1.nome = "oleo de soja";
        p1.preco = 1.200;
        p1.nome = "noteboob";



        p2.nome = "caneta bic";
        p2.preco = 1.25;
        System.out.println(p2.nome);
        System.out.println(p1.nome);

        double preco_fim1 = p1.precoComDesconto(0);
        double preco_fim2 = p2.precoComDesconto();

        System.out.println(preco_fim1);
        System.out.println(preco_fim2);


        //criei um tipo de estrutura de dados com 3 atributos, e instanciei 2 objetos com o tipo produto atraves
        //do construtor new (metodo especial)

        //exercicio desconto 25%
        System.out.println(p1.nome + " " + p1.precoComDesconto()); //todas vao ter o mesmo desconto, pois foi definido na class que o desconto é padrao a todos os objetos
        System.out.println(p2.nome + " " + p2.precoComDesconto());
    }

}
