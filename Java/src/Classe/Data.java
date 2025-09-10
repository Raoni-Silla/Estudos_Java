package Classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(int dia, int mes, int ano){
        // aqui eu digo oque são os parametros do construtor  e oque são variaveis do objeto que vai ser criado
        //todos que tem o this, vao ser variaveis do objeto que vai ser criado apartir desse construtor e em frente são os parametros
        //que vao ser passados a essas variaveis
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }
    Data(){
       // dia = 01; // dia padrao
       // mes = 01; //mes padrao
       // ano = 1970; //ano padrao

        this (01,01,1970); // posso usar o this como objeto e como metodo
        //oque vai definir qual construtor o this vai chamar, so podendo usar this como metodo dentro do construtor
        //são os parametros passados
    }
    // como nao é um metodo estatico e sim um metodo de instancia, eu posso usar o this para referenciar o objeto atual
    String obterDataFormatada (){

        return String.format("%d/%d/%d", this.dia, this.mes, this.ano); //o metodo format formata como se fosse um printf

    }
}
