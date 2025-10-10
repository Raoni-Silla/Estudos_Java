package StreamAPI.DesafioGemini;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private double salario;
    private String setor;
    private String contrato;


    Funcionario (String nome, double salario, String setor, String contrato) {
        setNome(nome);
        setSalario(salario);
        setContrato(contrato);
        setSetor(setor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 1500.0) {
            System.out.println("Salario menor que um salario minimo!!");
            System.out.println("Salario: " + this.salario);
            this.salario = 0.0;
        }else {
            this.salario = salario;
        }
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return "Funcionario:" +
                "nome: '" + nome + '\'' +
                ", salario: " + salario +
                ", setor: '" + setor + '\'' +
                ", contrato: '" + contrato + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
