package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.model.Aluno;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Utilitarios {
    private  Utilitarios(){}
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        public static List<LocalDate> extrairDatasNascimento(List<Aluno> alunos) {

                List<LocalDate> listaDeResultados = new ArrayList<>();
                for (Aluno aluno : alunos) {
                    LocalDate nascimento = LocalDate.parse(aluno.getDataNascimento(), Utilitarios.formatter);

                    listaDeResultados.add(nascimento);
                }
                return listaDeResultados;
        }


        public static List<Integer> calculaIdade(List <LocalDate> listaDeDatas){
            List<Integer> listaDeIdades = new ArrayList<>();

            for (LocalDate data : listaDeDatas) {
            int idade = calculaIdade(data);
            listaDeIdades.add(idade);
         }

            return listaDeIdades;
    }

    public static int calculaIdade(LocalDate nascimento) {
        return Period.between(nascimento, LocalDate.now()).getYears();
    }

    public static void printUtil(Object obj) {
        System.out.println(obj);
    }

}
