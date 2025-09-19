package Classe.ooEncapsulamento.casaB;

import Classe.ooEncapsulamento.casaA.Ana;

public class Pedro extends Ana {

    Ana mae = new Ana();

    void testeAcessos (){

        //so é visto aqui dentro


       // System.out.println(mae.facoDentroDeCasa);
       // System.out.println(mae.formaFalar); existe uma herança entre pedro e ana, mas da forma que esta, estou tentando acessar de uma instancia de ana, e nao da herança
        System.out.println(todosSabem);
        System.out.println(formaFalar);
        //System.out.println(esposa.secret);


    }

}
