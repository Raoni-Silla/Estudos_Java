package br.com.raoni.heranca;



import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AB")
public class AlunoBolsista extends Aluno {

    private Double valorBolsa;
    public AlunoBolsista() {}

    public AlunoBolsista(int matricula, String nome, Double valorBolsa) {
        super(matricula, nome);
        this.valorBolsa = valorBolsa;
    }

}
