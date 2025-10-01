package GuanabaraPOO.Polimorfismo.Sobrecarga;

public abstract class Animal {
    protected int idade;
    protected double peso;
    protected String membros;

    public abstract void emitirSom();

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMembros() {
        return membros;
    }

    public void setMembros(String membros) {
        this.membros = membros;
    }
}
