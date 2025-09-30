package GuanabaraPOO.EncapsulamentoeAbstracao.Banco.UFC;

public class Lutador implements LutadorInterface {

     private String nome, nacionalidade, categorias;
     private int idade, vitorias, derrotas, empates;
     private double altura, peso;

    Lutador (String nome,
             String nacionalidade
            ,int idade
            ,double altura
            ,double peso
            ,int vitorias
            ,int derrotas
            ,int empates){

        setNome(nome);
        setNacionalidade(nacionalidade);
        setAltura(altura);
        setIdade(idade);
        setPeso(peso);
        setVitorias(vitorias);
        setDerrotas(derrotas);
        setEmpates(empates);

        //feita automaticamente
        //this.categorias = categorias;
    }

     // apresenta o lutador
     public void apresentar (){
         System.out.println("Apresentando o lutador: ");
         System.out.println("Nome: " + getNome());
         System.out.println("Idade: " + getIdade());
         System.out.println("Origem: " + getNacionalidade());
         System.out.println("Altura: " + getAltura() + " m");
         System.out.println("Peso: " + getPeso() + "kg");
         System.out.println("Seu cartel pessoal: ");
         System.out.println("Wins: " + getVitorias());
         System.out.println("Loses: " + getDerrotas());
         System.out.println("Empates: " + getEmpates());
     }

     //dados menores do lutador
     public void status (){
         System.out.println(getNome());
         System.out.println(getCategorias());
         System.out.println(getVitorias());
         System.out.println(getEmpates());
         System.out.println(getDerrotas());
     }

     //oque um lutador pode fazer na luta:
     public void ganharLuta (){
         setVitorias(getVitorias() + 1);
     }
     public void perderLuta (){
         setDerrotas(getDerrotas() + 1);
     }
     public void empatarLuta (){
         setEmpates(getEmpates() + 1);
     }



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
         setCategorias();
    }

    public String getCategorias() {
        return categorias;
    }

    private void setCategorias() {
         if ( this.peso < 52.2){
             this.categorias = "invalido";
         } else if (this.peso <= 70.3) {
             this.categorias = "leve";
         } else if (this.peso <= 83.9 ) {
             this.categorias = "Médio";
         } else if (this.peso <= 120.2) {
             this.categorias = "pesado";
         }else this.categorias = "invalido";
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
