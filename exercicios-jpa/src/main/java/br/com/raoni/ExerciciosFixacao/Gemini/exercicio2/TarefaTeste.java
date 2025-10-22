package br.com.raoni.ExerciciosFixacao.Gemini.exercicio2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.List;

public class TarefaTeste {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        System.out.println("=================Consultas com JPA==================");

        List <Tarefa> tarefas = List.of(
                new Tarefa("Estudar Jpa","Fixar ConceitosCrud e JPQL",false, LocalDate.now()),
                new Tarefa("Fazer compras","Arroz, Feijão e batata", true,LocalDate.now()),
                new Tarefa("Lavar o Carro","N/A",true, LocalDate.now().minusDays(1))
        );

        em.getTransaction().begin();
        for (Tarefa tarefa : tarefas) {
            em.persist(tarefa);
        }

        em.getTransaction().commit();
        em.getTransaction().begin();
        Tarefa buscada = em.find(Tarefa.class, 1L);
        buscada.setDescricao("conceitos de crud e jpql estão se solidificando, ta indo");
        em.getTransaction().commit();

        em.getTransaction().begin();
        Tarefa buscada2 = em.find(Tarefa.class, 2L);
        em.detach(buscada2);
        buscada2.setNome("Fazer compras da semana");
        em.getTransaction().commit();

        em.getTransaction().begin();
        em.merge(buscada2);
        em.getTransaction().commit();

        em.getTransaction().begin();
        Tarefa exclude = em.find(Tarefa.class, 3L);
        if(exclude == null){
            System.out.println("Tarefa Vazio");
        }else em.remove(exclude);
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}
