package br.com.raoni.TesteBasico;

import br.com.raoni.ModeloBasico.Usuarios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exclusao {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuarios u = em.find(Usuarios.class, 1L);

        if (u != null) {
            em.getTransaction().begin();
            em.remove(u);
            System.out.println("Removido com sucesso" + u);
            em.getTransaction().commit();
        }



        em.close();
        emf.close();
    }
}
