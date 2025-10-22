package br.com.raoni.ExerciciosFixacao.Gemini.exercicio2;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomes_tarefa", nullable = false,length = 150)
    private String nome;

    @Column(name = "desc_tarefa")
    private String descricao;

    @Column(name = "Estado_tarefa")
    private boolean concluida;

    @Column(name = "Data_Criacao")
    private LocalDate dataCriacao;

    public Tarefa() {}

    public Tarefa(String nome, String descricao, boolean concluida, LocalDate dataCriacao) {
        setNome(nome);
        setDescricao(descricao);
        setConcluida(concluida);
        setDataCriacao(dataCriacao);
    }
}
