package br.edu.fema.atividadesfixacaojava;

import br.edu.fema.atividadesfixacaojava.services.*;

public class Main {

    public static void main(String[] args) {

        Atividade ConverterListSet01 = new ConverterListSet();
        Atividade ConverterSetList02 = new ConverterListSetEspecifico();
        Atividade MapearListAluno = new MapearListAluno();
        Atividade FiltrarAluno =  new FiltrarAluno();


        System.out.println("============01ConverterListSet01============");
        ConverterListSet01.executar();
        System.out.println("\n============02ConverterListSet02============");
        ConverterSetList02.executar();
        System.out.println("\n============03MapearListAluno============");
        MapearListAluno.executar();
        System.out.println("\n============04FiltrarListAluno============");
        FiltrarAluno.executar();
        

    }
}
