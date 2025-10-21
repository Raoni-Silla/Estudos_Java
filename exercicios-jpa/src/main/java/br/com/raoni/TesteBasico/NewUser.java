package br.com.raoni.TesteBasico;

import br.com.raoni.ModeloBasico.Usuarios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NewUser {
    public static void main(String[] args) {

        EntityManager em;
        //o entity manager que é responsvael por manipular os dados
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa") ;
        //o entity manager factory cria um entity manager
        //ele faz o crude, mas tambem esta ligado com o entity manager
        em = emf.createEntityManager();
        Usuarios usuario = new Usuarios("jonhArias","arias@gmail.com","R12345");
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
