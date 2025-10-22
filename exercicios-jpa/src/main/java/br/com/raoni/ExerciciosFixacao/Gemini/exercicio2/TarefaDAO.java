package br.com.raoni.ExerciciosFixacao.Gemini.exercicio2;

import br.com.raoni.infra.DAO;

import javax.persistence.TypedQuery;
import java.util.List;

public class TarefaDAO extends DAO<Tarefa> {

    public TarefaDAO(){
        super(Tarefa.class);
    }


    public List<Tarefa> buscarTarefaPorStatus(boolean concluida){
        String jpql = "select t from Tarefa t where t.concluida = :status";

        TypedQuery<Tarefa> query = em.createQuery(jpql, Tarefa.class);

        query.setParameter("status", concluida);

        return query.getResultList();
    }


    public List<Tarefa> buscarPorTitulo(String titulo){
        String jpql = "select t from Tarefa t where t.nome LIKE :titulo";

        TypedQuery<Tarefa> query = em.createQuery(jpql, Tarefa.class);

        query.setParameter("titulo", "%" + titulo + "%");

        return query.getResultList();
    }
}