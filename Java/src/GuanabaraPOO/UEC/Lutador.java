package GuanabaraPOO.UEC;

public class Lutador {
     private String nome;
     private String nacionalidade;
     private int idade;
     private double altura;
     private double peso;
     private String categorias;
     private int vitorias;
     private int derrotas;
     private int empates;


     Lutador (String nome, String nacionalidade, int idade,double altura, double peso, String categorias ){
         this.nome = nome;
         this.nacionalidade = nacionalidade;
         this.idade = idade;
         this.altura = altura;
         this.peso = peso;
         this.categorias = categorias;
     }

     // apresenta o lutador
     public void apresentar (){}

     //dados menores do lutador
     public void status (){}

     //oque um lutador pode fazer na luta:
     public void ganharLuta (){}
     public void perderLuta (){}
     public void empatarLuta (){}



    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
