package br.com.raoni.umpraum;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tbs_assentos")
public class Assentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public Assentos() {}

    public Assentos(String nome) {
        this.nome = nome;
    }
}
