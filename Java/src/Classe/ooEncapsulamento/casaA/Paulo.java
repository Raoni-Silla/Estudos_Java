package Classe.ooEncapsulamento.casaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcessos (){

         //so é visto aqui dentro


        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaFalar);
        System.out.println(esposa.todosSabem);
        //System.out.println(esposa.secret);


    }

}
