package Lombok;

import java.util.Objects;

public class Treino01 {
    //o intuito do lombok é reduzir os codigos repetitivos
    private String nome;
    private long id;
    private String descricao;



    //Visa reduzir codigos repetitivos como os codigos abaixo:

    @Override
    public String toString() {
        return "Treino01{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Treino01 treino01 = (Treino01) o;
        return id == treino01.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
