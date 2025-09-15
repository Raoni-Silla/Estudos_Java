package Classe.oo.composicao.exercicios;

public class Cnh {

    String nRegistro;
    String cat = "AB";
    int status = 1;


    Cnh (String nRegistro){
        this.nRegistro = nRegistro;
    }

    Cnh (){}

    void exibirInfoCnh (){
        System.out.printf("o numero de registro da sua cnh é %s \n sendo habilitado na(s) categorias: %s\n",nRegistro,cat);

    }

}
