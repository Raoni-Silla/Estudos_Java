package br.com.cod3r.exerciciosSB.models;

import lombok.Data;

@Data
public class Cliente {

    private int id;

    private String nome;

    private String email;

    private String telefone;

    private String cpf;

    public Cliente (int id,String nome, String email, String telefone, String cpf) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.id = id;
    }
}
