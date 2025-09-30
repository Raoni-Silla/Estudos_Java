package GuanabaraPOO.Heranca.Aula10ab;

/**
 * aqui na parte do construtor o construtor de aluno chama o construtor da super classe
 * pra poder instanciar o objeto aluno
 */
public class Aluno extends Pessoa{
    private long matricula;
    private String curso;

    Aluno(String nome, int idade, String sexo, long matricula, String curso) {
        super(nome, idade, sexo);
        setMatricula(matricula);
        setCurso(curso);
        setMatricula(matricula);
        setCurso(curso);
    } //construtor aluno chama o construtor super da classe pai para instanciar um objeto do tipo aluno



    public void cancelarMatricula(){

        System.out.println("Matricula cancelada");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
}
