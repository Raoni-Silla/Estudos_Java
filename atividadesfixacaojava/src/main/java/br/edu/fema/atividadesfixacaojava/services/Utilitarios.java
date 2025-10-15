package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.enums.Periodo;
import br.edu.fema.atividadesfixacaojava.model.Aluno;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Utilitarios {

    private  Utilitarios(){}


    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public static List<Aluno> alunosCadastroMes(List<Aluno> listaAlunos) {
        return listaAlunos.stream()
                .collect(Collectors.groupingBy(a -> MonthDay.from(a.getDataHoraCadastro())))
                .values().stream().filter(a ->a.size() > 1).flatMap(List::stream).toList();

        //eu crio uma stream de lista de alunos
        //uso o collect pra agrupar minha lista em chave:dia/mes e valor [lista de alunos]
        //depois pego apenas o valor
        //crio outra stream
        //filtro as listas que tenham mais de 1 membros
        //uso o flat map para juntar todas as micro listas
        //em uma lista só
    }


        public static boolean isCadastradosPos18hrs (Aluno aluno){
            LocalTime HoraLimite = LocalTime.parse("18:00:00");
          return aluno.getDataHoraCadastro().toLocalTime().isAfter(HoraLimite);
        }

        public static boolean isNascidosPos2001 (Aluno aluno){
            LocalDate DataLimite = LocalDate.of(2001,2,15);
            return LocalDate.parse(aluno.getDataNascimento(),Utilitarios.formatter).isAfter(DataLimite);
        }

        public static boolean isPossuemCurso (Aluno aluno){ return aluno.getCurso() != null;}

        public static boolean isNaoPossuemCurso(Aluno aluno){return aluno.getCurso() == null;}

        public static boolean isverificarPeriodo (Aluno aluno){

            if (aluno.getCurso() == null){
                return false;
            }else return aluno.getCurso().getPeriodo().equals(Periodo.MATUTINO);
        }

        public static boolean iscalculaIdade30 (Aluno aluno){
            LocalDate data = LocalDate.parse(aluno.getDataNascimento(), formatter);
            return ChronoUnit.YEARS.between(data, LocalDate.now()) > 30;
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
            long idade = calculaIdadeUni(data);
            Integer novaIdade = Integer.parseInt(String.valueOf(idade));
            listaDeIdades.add(novaIdade);
         }

            return listaDeIdades;
    }

    public static long calculaIdadeUni(LocalDate nascimento) {
            return ChronoUnit.YEARS.between(nascimento, LocalDate.now());
    }

    public static void printUtil(Object obj) {
        System.out.println(obj);
    }


}
