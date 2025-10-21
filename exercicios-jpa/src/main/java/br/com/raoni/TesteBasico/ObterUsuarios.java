package br.com.raoni.TesteBasico;

import br.com.raoni.ModeloBasico.Usuarios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ObterUsuarios {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        String jpql = "select u from Usuarios u";
        TypedQuery<Usuarios> query = em.createQuery(jpql, Usuarios.class);
        query.setMaxResults(4);
        List<Usuarios> usuarios = query.getResultList();

        for (Usuarios u : usuarios) {
            System.out.println(u);
        }

        em.close();
        emf.close();

    }
}
