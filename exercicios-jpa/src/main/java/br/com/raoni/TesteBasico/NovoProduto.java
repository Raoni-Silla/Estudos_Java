package br.com.raoni.TesteBasico;

import br.com.raoni.ModeloBasico.ProdutosJava;
import br.com.raoni.infra.DAO;

import java.util.List;

public class NovoProduto {
    public static void main(String[] args) {
        DAO <ProdutosJava>  dao = new DAO<>(ProdutosJava.class);

        ProdutosJava produto = new ProdutosJava("LapisLazuli","Lapis de orr",2000.0);
        dao.abrirTransacao().incluir(produto).alterar(produto).fecharTransacao();

        System.out.println("Produto atualizado com sucesso " + produto.getId() + " ID");

        ProdutosDAO produtoDAO = new ProdutosDAO();
        List <ProdutosJava> produtos = dao.ObterTodos(10,0);
        produtos.forEach(System.out::println);

    }
}
