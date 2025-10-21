package br.com.raoni.TesteBasico;

import br.com.raoni.ModeloBasico.Usuarios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuarios1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuarios u = em.find(Usuarios.class, 1L);
        System.out.println(u);
        u.setNome("Raoní");
        u.setSenha("123");
        u.setEmail("Raonisilla@hotmail.com");
        em.merge(u);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
