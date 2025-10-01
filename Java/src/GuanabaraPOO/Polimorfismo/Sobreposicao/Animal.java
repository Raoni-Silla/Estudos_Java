package GuanabaraPOO.Polimorfismo.Sobreposicao;

public abstract class Animal {

    protected String peso;
    protected String idade;
    protected String membros;


    public abstract void emitirSom();
    public abstract void locomover();
    public abstract void alimentar();


    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getMembros() {
        return membros;
    }

    public void setMembros(String membros) {
        this.membros = membros;
    }
}
