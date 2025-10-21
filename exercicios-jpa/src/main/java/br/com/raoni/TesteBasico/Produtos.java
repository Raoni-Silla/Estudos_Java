package br.com.raoni.TesteBasico;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String nome;

    @Column(length = 100)
    private Double preco;

    public Produtos(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produtos() {}

}
