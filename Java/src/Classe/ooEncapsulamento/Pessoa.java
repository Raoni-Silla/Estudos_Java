package Classe.ooEncapsulamento;

public class Pessoa {

   private int idade;//unica coisa que pode modificar agora é a propria classe
   private  String nome;
   private String sobrenome;
   //vantagem de fazer validações sem mudar o codigo main
   //podendo mudar o atributo apenas se ele for valido
   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }



   // usa o metodo no construtor para validação
   Pessoa (int idade ){
      setIdade(idade);
   }

   //como faço pra ver varivael privada??
  // crio um metodo publico pra ler a variavel
   public int getIdade (){
      return idade;
   }
   // estou alterando um valor privado apartir do metodo
   public void setIdade (int novaIdade){
      novaIdade = Math.abs(novaIdade);
      if(novaIdade >= 0 && novaIdade <= 120){
         this.idade = novaIdade;
      }
   }

   // o ganho pra acessar o metodo dos atributos, é a vantagem de usar ele em 300 lugares no seu sistema

  @Override
   public String toString (){
      return "ola eu sou o " + getNome() + " idade " + getIdade();
  }

}

