package GuanabaraPOO.Heranca.Aula10ab;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;


    public void mudarTrabalho()
    {
        this.trabalhando = true;
    }

    public Funcionario(String nome, int idade, String sexo, String setor)
    {
        super(nome, idade, sexo);
        setSetor(setor);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
