package br.com.raoni.MuitosPraMutios;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Tios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @ManyToMany
    private List<Sobrinho>sobrinhos = new ArrayList<>();

    public Tios(String nome) {
        this.nome = nome;
    }

    public Tios() {}
}
