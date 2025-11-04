package br.com.raoni.umpraum;

import br.com.raoni.infra.DAO;

public class NovoClieAs2 {
    public static void main(String[] args) {
        Assentos assentos = new Assentos("12c");
        Cliente cliente  = new Cliente("pontes","4506787659",assentos);

        DAO <Object> dao = new DAO<>();

        dao.abrirTransacao().incluir(cliente).fecharTransacao();
    }
}
