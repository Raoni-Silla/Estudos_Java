package br.com.raoni.infra;

import br.com.raoni.ModeloBasico.ProdutosJava;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DAO <Entidade> {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
    private EntityManager em;
    private Class<Entidade> entidade;

    public DAO(Class<Entidade> entidade) {
        em = emf.createEntityManager();
        this.entidade = entidade;
    }
    public DAO() {
        this(null);
    }

    public DAO<Entidade> abrirTransacao(Entidade entidade) {
        em.getTransaction().begin();
        return this;
    }
    public DAO<Entidade> fecharTransacao(Entidade entidade) {
        em.getTransaction().commit();
        return this;
    }
    public DAO<Entidade> incluir(Entidade entidade) {
        em.persist(entidade);
        return this;
    }

}
