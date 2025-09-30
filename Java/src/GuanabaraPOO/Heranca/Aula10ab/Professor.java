package GuanabaraPOO.Heranca.Aula10ab;

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    Professor(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }


    public void receberAumento (){



    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
