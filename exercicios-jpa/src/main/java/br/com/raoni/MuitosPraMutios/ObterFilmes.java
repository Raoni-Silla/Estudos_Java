package br.com.raoni.MuitosPraMutios;

import br.com.raoni.infra.DAO;

import java.util.List;

public class ObterFilmes {
    public static void main(String[] args) {
        DAO<Filme> dao = new DAO<>(Filme.class);
        List<Filme> filmes = dao.consultar("filmesNotaMaiorQue", "nota", 8.6);

    }
}
