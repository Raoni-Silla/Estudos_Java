package br.com.raoni.MuitosPraMutios;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Sobrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @ManyToMany (mappedBy = "sobrinhos")
    private List <Tios> tios = new ArrayList<>();

   public  Sobrinho(){

    }
    public Sobrinho(String nome){
        this.nome = nome;
    }
}
