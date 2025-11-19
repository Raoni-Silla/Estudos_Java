package br.com.cod3r.exerciciosSB.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

//java validation ajuda a fazer validações simples

@Data
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotBlank //api do proprio java, java validation, não pode ser vazio
    String nome;

    @Min(0)//valor minimo do preço é zero
    private Double preco;

    @Min(0)
    @Max(1) //valor minimo do desconto é 0 e o maximo é de 1
    private Double desconto;

    public Produto() {}

    public Produto(String nome, Double preco, Double desconto) {
        this.nome = nome;
        setPreco(preco);
        setDesconto(desconto);
    }


    public void setPreco(Double preco) {
        if (preco == null || preco <= 0) {
            throw new IllegalArgumentException("Preço inválido. Deve ser maior que zero.");
        } else {
            this.preco = preco;
        }
    }


    public void setDesconto(Double desconto) {
       if (desconto == null || desconto < 0 || desconto > 1.0){
           throw new IllegalArgumentException("nulo ou menor que zero");
       }else  {
           this.desconto = desconto;
       }
    }


}
