package br.com.raoni.heranca;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // cria uma unica tabela
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
//nome da coluna é tipo, vai ter tamanho 2, e o tipo dela é string
@DiscriminatorValue("Al") //a anotação pra discriminar é Al
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // pra cada classe concreta tenho uma tabela
public class Aluno {

    @Id
    private int matricula;

    private String nome;

    public Aluno() {}
    public Aluno(int matricula, String nome) {
        setMatricula(matricula);
        setNome(nome);
    }

}
