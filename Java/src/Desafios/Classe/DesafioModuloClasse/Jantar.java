package Desafios.Classe.DesafioModuloClasse;

import java.util.Scanner;

/**
 * Questão:
 * Crie duas classes em Java: Pessoa e Comida.

 * A classe Pessoa deve possuir os atributos nome e peso, além de um método comer(Comida comida).

 * A classe Comida deve possuir os atributos nome e peso.

 * O método comer da classe Pessoa deve receber um objeto do tipo Comida e somar o peso da comida ao peso da pessoa, de forma que a pessoa aumente seu peso conforme come.

 * No método main:

 * Instancie um objeto do tipo Pessoa.

 * Instancie alguns objetos do tipo Comida (com diferentes nomes e pesos).

 * Mostre o peso inicial da pessoa.

 * Faça a pessoa comer as comidas instanciadas.

 * Mostre o peso final da pessoa após comer.
 */
public class Jantar {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        Pessoa eduardo = new Pessoa("eduardo",98.70);
        Comida macarrao = new Comida("macarrao",0.559);
        Comida arroz = new Comida("Arroz", 0.235);

        System.out.println("bem vindo ao nosso sistema de comida:");
        System.out.println("oque deseja comer hoje?: ");
        System.out.printf("USER: %s PESO %.2f", eduardo.nome, eduardo.peso);
        System.out.println("\n 1-arroz 2-macarrao");
        int i = cin.nextInt();

        switch (i){
            case 1:
                System.out.println("------------------------------------------");
                System.out.println("Entendido, arroz selecionado");
                System.out.println("Você come arroz....");
                System.out.println("seu peso atual: "+ eduardo.peso);
                System.out.println("peso da comida escolhida: "+ arroz.peso);
                System.out.println("você engordou "+ eduardo.comer(arroz) +" KG");
                System.out.println("-----------------------------------------");
                break;
            case 2:
                System.out.println("------------------------------------------");
                System.out.println("Entendido, macarronada selecionada");
                System.out.println("Você come macarronada....");
                System.out.println("seu peso atual: "+ eduardo.peso);
                System.out.println("peso da comida escolhida: "+ macarrao.peso);
                System.out.println("você engordou "+ eduardo.comer(macarrao) +" KG");
                System.out.println("-----------------------------------------");

        }




    }
}
