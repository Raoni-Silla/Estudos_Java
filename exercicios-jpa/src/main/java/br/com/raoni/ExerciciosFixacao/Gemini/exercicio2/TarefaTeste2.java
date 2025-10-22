package br.com.raoni.ExerciciosFixacao.Gemini.exercicio2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TarefaTeste2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        String jpql = "select todas from Tarefa todas";
        TypedQuery<Tarefa> query = em.createQuery(jpql, Tarefa.class);


        em.close();
        emf.close();
    }
}
