package br.com.raoni.ExerciciosFixacao.Gemini.exercicio2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class TarefaTeste2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        String jpql = "select todas from Tarefa todas";
        TypedQuery<Tarefa> query = em.createQuery(jpql, Tarefa.class);
        List<Tarefa> todas = query.getResultList();
        System.out.println("Consultando todos os registros da tabela");
        for (Tarefa tarefa : todas) {
            System.out.println(tarefa);
        }


        System.out.println("concluidas:");
        String jpql2 = "select todas from Tarefa todas where todas.concluida = true";
        TypedQuery<Tarefa> query2 = em.createQuery(jpql2, Tarefa.class);
        List<Tarefa> todas2 = query2.getResultList();
        System.out.println("Consultando todos os registros da tabela com where");
        for (Tarefa tarefa : todas2) {
            System.out.println(tarefa);
        }


        System.out.println("Consultando com like");

        String jpql3 = "select t from Tarefa t where t.nome LIKE :parametro";
        TypedQuery<Tarefa> query3 = em.createQuery(jpql3, Tarefa.class);
        query3.setParameter("parametro","%compras%");
        List<Tarefa> todas3 = query3.getResultList();

        for (Tarefa tarefa : todas3) {
            System.out.println(tarefa);
        }
        em.close();
        emf.close();
    }
}
