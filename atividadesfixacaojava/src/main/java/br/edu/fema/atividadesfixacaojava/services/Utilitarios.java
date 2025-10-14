package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.enums.Periodo;
import br.edu.fema.atividadesfixacaojava.model.Aluno;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class Utilitarios {

    private  Utilitarios(){}


    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static List<Aluno> alunosCadastroMesDataIguais(List<Aluno> listaAlunos) {
        DateTimeFormatter formatadorF = DateTimeFormatter.ofPattern("dd/MM");

        Set<String> datasDuplicadas = listaAlunos.stream()
                .collect(Collectors.groupingBy(a -> a.getDataHoraCadastro().format(formatadorF),Collectors.counting()
                )).entrySet()
                  .stream()
                  .filter(a -> a.getValue() > 1)
                  .map(Map.Entry::getKey)
                  .collect(Collectors.toSet());

        //aqui ele agrupa as datas atraves das datas, ele separa as datas e conta quantos
        //objetos possuem datas iguais ("17/09" 1), depois ele ordena cada item em par com
        //o entry set e reinicia a stream, depois faz um filtro atraves dos valores
        //(CHAVE, VALOR), no caso a data aqui é a chave e o valor é a quantidade de objetos em cada data
        //ele verifica os pares com valores > 1, depois desse controle, ele modifica a stream
        //pegando apenas a chave do map,depois transforma essa stream em set

        if (datasDuplicadas.isEmpty()) {
            return List.of();
        }
        //verifica se a lista de datas duplicadas esta vazia, se tiver retorna vazio mesmo

        return listaAlunos.stream()
                .filter(aluno -> datasDuplicadas.contains(aluno.getDataHoraCadastro().format(formatadorF)))
                .collect(Collectors.toList());

        //aqui ele filtra, ele pergunta quais datas da stream da lista de alunos tem na lista de alunos
        //depois transforma isso em um list e retorna o valor
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
            long idade = calculaIdade(data);
            Integer novaIdade = Integer.parseInt(String.valueOf(idade));
            listaDeIdades.add(novaIdade);
         }

            return listaDeIdades;
    }

    public static long calculaIdade(LocalDate nascimento) {
            return ChronoUnit.YEARS.between(nascimento, LocalDate.now());
    }

    public static void printUtil(Object obj) {
        System.out.println(obj);
    }

}
