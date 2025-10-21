package br.com.raoni.ModeloBasico;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_Produtos")
@Data
public class ProdutosJava {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "prod_nome", length = 120, nullable = false)
    private String nome;

    @Column(name = "prod_desc", length = 220, nullable = true)
    private String descricao;

    @Column (name = "prod_preco",nullable = false, precision = 11, scale = 2)
    private Double preco;

    public ProdutosJava(){}

    public ProdutosJava(String nome, String descricao, Double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
}
