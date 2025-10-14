package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.model.Aluno;
import br.edu.fema.atividadesfixacaojava.repository.AlunoRepository;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FiltrarAluno implements Atividade{
    @Override
    public void executar() {

        List < Aluno > ListaAlunos = AlunoRepository.findAll();


        System.out.println("\n============Lista de nascidos pós 15/02/2001============");
        List <Aluno> NascidosPos2001 = ListaAlunos.stream().filter(Utilitarios::isNascidosPos2001).toList();
        IntStream.range(0, NascidosPos2001.size()).forEach(i -> {
           Aluno aluno = NascidosPos2001.get(i);
            System.out.printf("\nNome: %s, Data de nascimento: %s", aluno.getNomeCompleto(), aluno.getDataNascimento());
        });

        System.out.println("\n============Lista de alunos cadastrados pós 18 horas============");
        Set  <Aluno> CadastradosPos18hrs = ListaAlunos.stream().filter(Utilitarios::isCadastradosPos18hrs).collect(Collectors.toCollection(LinkedHashSet::new));
        for (Aluno a : CadastradosPos18hrs) {
            System.out.printf("\nNome: %s , Hora de cadastro: %s", a.getNomeCompleto(), a.getDataHoraCadastro());
        }

        System.out.println("\n============Lista de alunos que não possuem curso============");
        List <Aluno> NaoPossuemCurso = ListaAlunos.stream().filter(Utilitarios::isNaoPossuemCurso).toList();
        IntStream.range(0,NaoPossuemCurso.size()).forEach(i -> {
           Aluno a = NaoPossuemCurso.get(i);
            System.out.printf("\nNome: %s com id %d não tem curso", a.getNomeCompleto(), a.getId());
        });

        System.out.println("\n============Lista de alunos que possuem curso============");
        Set  <Aluno> possuemCurso = ListaAlunos.stream().filter(Utilitarios::isPossuemCurso).collect(Collectors.toCollection(LinkedHashSet::new));
        for (Aluno aluno : possuemCurso) {
            System.out.printf("\nNome: %s , Curso: %s ", aluno.getNomeCompleto(), aluno.getCurso().getDescricao());
        }

        System.out.println("\n============Alunos com mais de 30 e estudam de manhã============");
        List <Aluno> MaisDe30Manha = ListaAlunos.stream().filter(Utilitarios::isverificarPeriodo).filter(Utilitarios::iscalculaIdade30).toList();
        IntStream.range(0,MaisDe30Manha.size()).forEach(i -> {
            Aluno a = MaisDe30Manha.get(i);
            System.out.printf("\nNome: %s , Data Nascimento: %s , Periodo: &s",a.getNomeCompleto(),a.getDataNascimento(), a.getCurso().getPeriodo().getDescricao());
        });

        Optional <Aluno> primeiroAluno = ListaAlunos.stream().filter(x -> x.getDataHoraCadastro().getYear() == 2021).min(Comparator.comparing(Aluno::getDataHoraCadastro));
        System.out.println("\n============Primeiro aluno de 2021============");
        if(primeiroAluno.isPresent()){
            System.out.println("\nprimeiroAluno: " + primeiroAluno.get().getNomeCompleto());
        }else {
            System.out.println("\nNenhum Aluno encontrado");
        }

        List<Aluno> CadastradosMesmoData = ListaAlunos.stream().filter(Utilitarios::isCadastradosMesmoDiaMes).toList();
            System.out.println("\n============Cadastrados no mesmo dia e mês============");
            IntStream.range(0, CadastradosMesmoData.size())
                .forEach(i -> {
                    Aluno aluno = CadastradosMesmoData.get(i);
                    System.out.printf("\nNome: %s, Numero: %d\n", aluno.getNomeCompleto(), i + 1);
                });




        //converto a data de nascimento pra local date, pra usar o isafter, pra pegar apenas datas apos a data limite
    }
}
