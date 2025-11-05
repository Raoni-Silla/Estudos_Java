package br.com.raoni.MuitosPraMutios;

import br.com.raoni.infra.DAO;

public class NovoTioSobrinho {
    public static void main(String[] args) {
        Sobrinho sobrinho = new Sobrinho("Carlos");
        Sobrinho sobrinho2 = new Sobrinho("Pietro");

        Tios tia1 = new Tios("joana");
        Tios tio2 = new Tios("marcos");

        tia1.getSobrinhos().add(sobrinho);
        sobrinho.getTios().add(tia1);

        tia1.getSobrinhos().add(sobrinho2);
        sobrinho2.getTios().add(tia1);

        tio2.getSobrinhos().add(sobrinho);
        sobrinho.getTios().add(tio2);

        tio2.getSobrinhos().add(sobrinho2);
        sobrinho2.getTios().add(tio2);

        DAO<Object> dao = new DAO<>();

        dao.abrirTransacao().incluir(tia1).incluir(tio2).incluir(sobrinho).incluir(sobrinho2).fecharTransacao().fecharEm();

    }
}
