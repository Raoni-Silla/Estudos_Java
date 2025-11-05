package br.com.raoni.MuitosPraMutios;

import br.com.raoni.infra.DAO;

public class FilmeAtor {
    public static void main(String[] args) {
        Filme starwars = new Filme("StarWars ep V", 8.7);

        Ator a = new Ator("Harrison ford");
        Ator b = new Ator("British ford");

        starwars.adcAtor(a);
        starwars.adcAtor(b);

        Filme startrek = new Filme("Startrek ep V", 8.9);
        startrek.adcAtor(a); //defini que sera definido uma operação em cascata que sempre q eu persistir um filme ele persiste os autores, e se eu colocar um cascade em atores ele persiste os filmes

        DAO<Filme> filmeDAO = new DAO<>();
        filmeDAO.abrirTransacao().incluir(starwars).fecharTransacao().fecharEm();

    }
}
