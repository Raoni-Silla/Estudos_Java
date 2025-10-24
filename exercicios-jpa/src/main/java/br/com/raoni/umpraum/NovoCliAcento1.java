package br.com.raoni.umpraum;

import br.com.raoni.infra.DAO;

public class NovoCliAcento1 {

    public static void main(String[] args) {

        Assentos assentos = new Assentos("16c");
        Cliente cliente = new Cliente("Raoní","4506787659",assentos);

        DAO <Object> dao = new DAO<>();

        dao.abrirTransacao().incluir(assentos).incluir(cliente).fecharTransacao();

    }
}
