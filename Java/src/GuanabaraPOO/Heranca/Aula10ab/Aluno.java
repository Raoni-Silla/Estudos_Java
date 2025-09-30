package GuanabaraPOO.Heranca.Aula10ab;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    Aluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    } //construtor aluno chama o construtor super da classe pai para instanciar um objeto do tipo aluno



    public void cancelarMatricula(){

    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
