package Desafios.Classe.DesafioModuloClasse;

public class Pessoa {

    String nome;
    double peso;

    Pessoa (String nome, double peso){
        // referenciei oque é atributo da instancia e oque é parametro
        this.nome = nome;
        this.peso = peso;

    }

   double comer (Comida comida){

     return  peso += comida.peso;

    }

}
