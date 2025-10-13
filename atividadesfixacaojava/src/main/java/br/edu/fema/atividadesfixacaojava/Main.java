package br.edu.fema.atividadesfixacaojava;

import br.edu.fema.atividadesfixacaojava.services.Atividade;
import br.edu.fema.atividadesfixacaojava.services.ConverterListSet;
import br.edu.fema.atividadesfixacaojava.services.ConverterListSetEspecifico;
import br.edu.fema.atividadesfixacaojava.services.MapearListAluno;

public class Main {

    public static void main(String[] args) {

        Atividade ConverterListSet01 = new ConverterListSet();
        Atividade ConverterSetList02 = new ConverterListSetEspecifico();
        Atividade MapearListAluno = new MapearListAluno();


        System.out.println("============ConverterListSet01============");
        ConverterListSet01.executar();
        System.out.println("============ConverterListSet02============");
        ConverterSetList02.executar();
        System.out.println("============MapearListAluno============");
        MapearListAluno.executar();
        

    }
}
