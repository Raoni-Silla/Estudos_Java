package Classe;
// criei um molde, que no momento que eu chamar um construtor para instanciar um objeto apartir desses mesmos atributos
public class Produto {
    String nome;
    double preco;
    double desconto;

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - (desconto + descontoDoGerente));
    }

    double precoComDesconto() {
        return preco * (1 - desconto );
    }
}
