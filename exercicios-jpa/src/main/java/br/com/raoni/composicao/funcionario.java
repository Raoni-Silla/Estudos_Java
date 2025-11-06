package br.com.raoni.composicao;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "funcionarios")
@Data
public class funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
}
