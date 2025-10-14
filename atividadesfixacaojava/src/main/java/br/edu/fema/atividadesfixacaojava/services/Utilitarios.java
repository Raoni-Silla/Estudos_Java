package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.enums.Periodo;
import br.edu.fema.atividadesfixacaojava.model.Aluno;
import com.sun.source.tree.TryTree;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Utilitarios {

    private  Utilitarios(){}


    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        public static boolean isCadastradosMesmoDiaMes (Aluno aluno){

            Month mesAux = aluno.getDataHoraCadastro().getMonth();
            int diaAux = aluno.getDataHoraCadastro().getDayOfMonth();

            return aluno.getDataHoraCadastro().getMonth().equals(mesAux) && aluno.getDataHoraCadastro().getDayOfMonth() == diaAux;

        }

        public static boolean isCadastradosPos18hrs (Aluno aluno){
            LocalTime HoraLimite = LocalTime.parse("18:00:00");
          return aluno.getDataHoraCadastro().toLocalTime().isAfter(HoraLimite);
        }

        public static boolean isNascidosPos2001 (Aluno aluno){
            LocalDate DataLimite = LocalDate.of(2001,2,15);
            return LocalDate.parse(aluno.getDataNascimento(),Utilitarios.formatter).isAfter(DataLimite);
        }

        public static boolean isPossuemCurso (Aluno aluno){
            return aluno.getCurso() != null;
        }

        public static boolean isNaoPossuemCurso(Aluno aluno){
            return aluno.getCurso() == null;
        }

        public static boolean isverificarPeriodo (Aluno aluno){
            try {
                return aluno.getCurso().getPeriodo().equals(Periodo.MATUTINO);
            }catch (NullPointerException ig){
                System.out.println("Ocorreu um NullPointerException: " + ig.getMessage());
            }
            return false;
        }

        public static boolean iscalculaIdade30 (Aluno aluno){
            LocalDate data = LocalDate.parse(aluno.getDataNascimento(), formatter);
            int idade = Period.between(data, LocalDate.now()).getYears();
            return idade > 30;
        }

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
