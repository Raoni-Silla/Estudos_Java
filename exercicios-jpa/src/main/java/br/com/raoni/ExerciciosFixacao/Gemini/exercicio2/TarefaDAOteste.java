package br.com.raoni.ExerciciosFixacao.Gemini.exercicio2;

import java.time.LocalDate;
import java.util.List;

public class TarefaDAOteste {
    public static void main(String[] args) {
                TarefaDAO tarefaDAO = new TarefaDAO();
                Tarefa novaTarefa = new Tarefa("Estudar Relacionamentos JPA", "...", false, LocalDate.now());


                tarefaDAO.abrirTransacao().incluir(novaTarefa).fecharTransacao();

                System.out.println("--- Buscando pendentes (false) ---");
                List<Tarefa> pendentes = tarefaDAO.buscarTarefaPorStatus(false);
                pendentes.forEach(System.out::println);

                System.out.println("--- Buscando concluídas (true) ---");
                List<Tarefa> concluidas = tarefaDAO.buscarTarefaPorStatus(true);
                concluidas.forEach(System.out::println);

                System.out.println("--- Buscando por 'compras' ---");
                List<Tarefa> compras = tarefaDAO.buscarPorTitulo("compras");
                compras.forEach(System.out::println);

                System.out.println("--- Buscando por 'JPA' ---");
                List<Tarefa> jpa = tarefaDAO.buscarPorTitulo("JPA");
                jpa.forEach(System.out::println);


                // Isso fecha o ÚNICO 'em'
                tarefaDAO.fecharEm();
    }
}
