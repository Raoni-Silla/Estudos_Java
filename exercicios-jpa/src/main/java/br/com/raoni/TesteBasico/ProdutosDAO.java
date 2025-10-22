package br.com.raoni.TesteBasico;

import br.com.raoni.ModeloBasico.ProdutosJava;
import br.com.raoni.infra.DAO;

public class ProdutosDAO extends DAO<ProdutosJava> {
    //posso isolar a classe produto pra colocar metodos especificos em produto

    public ProdutosDAO() {
        super(ProdutosJava.class);
    }

}
