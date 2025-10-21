package br.com.raoni.TesteBasico;

import br.com.raoni.ModeloBasico.Usuarios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuarios u = em.find(Usuarios.class, 1L);
        em.detach(u);
        u.setNome("gabriel");
        System.out.println(u);
        u.setNome("jonathan");
        u.setSenha("123");
        u.setEmail("job@hotmail.com");
        System.out.println(u);
        em.merge(u);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
