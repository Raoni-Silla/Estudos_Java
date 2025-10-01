package GuanabaraPOO.EncapsulamentoeAbstracao.BibliotecaGua;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;



    Pessoa(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }



    //-------------------getters e setters----------------------------//

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
