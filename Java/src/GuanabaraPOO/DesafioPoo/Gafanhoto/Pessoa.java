package GuanabaraPOO.DesafioPoo.Gafanhoto;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected double exp;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.exp = 0;
    }

    protected abstract void ganharExp() ;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", exp=" + exp +
                '}';
    }
}
