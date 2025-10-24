package br.com.raoni.umpraum;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "tbs_clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    @OneToOne
    private Assentos assento;

    public Cliente() {}

    public Cliente(String nome, String cpf,  Assentos assento) {
        this.nome = nome;
        this.cpf = cpf;
        this.assento = assento;
    }

}
