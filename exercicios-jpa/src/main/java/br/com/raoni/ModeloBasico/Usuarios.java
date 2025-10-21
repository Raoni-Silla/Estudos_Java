package br.com.raoni.ModeloBasico;


import lombok.Data;


import javax.persistence.*;

@Data
@Entity //essa classe vai ser uma entidade no bd
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //garante que cada entidade tem sua propria sequencia de id
    //entao a tabela usuarios vai ter sua propria sequencia de id
    private long id;

    private String nome;

    private String email;

    private String senha;

    public Usuarios(){}

    public Usuarios(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    @Entity
    @Data
    public static class Produtos {

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
}
