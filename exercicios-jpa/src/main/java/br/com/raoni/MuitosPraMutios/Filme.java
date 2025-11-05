package br.com.raoni.MuitosPraMutios;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "Filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    private Double nota;

    // tendo o persist dos dois lados, ele persiste em cascata todos os atores e filmes, mesmo se eu persistir apenas o filme 1 n tendo persistido os atores antes
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "atores_filmes", joinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "ator_id", referencedColumnName = "id"))
    private List<Ator>atores;

    public Filme() {}

    public Filme(String nome,  Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    //pra evitar ficar fazendo relações bidirecionais no codigo main, posso criar aqui metodos
    //pra nos ajudar na relação bidirecional

    //criar um metodo pra adicionar um ator
    public void adcAtor(Ator a) {
        if (a != null && !getAtores().contains(a)) {
           getAtores().add(a);
            if (!a.getFilmes().contains(this)) {
                a.getFilmes().add(this);
            }
        }
    }

    public List<Ator> getAtores() {
        if (atores == null) {
            atores  = new ArrayList<>();
            return atores;
        }
        return atores;
    }
}
