package br.com.raoni.composicao;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "fornecedores")
@Data
public class fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private endereco endereco;

    public fornecedor() {}

    public fornecedor(String nome, endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
}
