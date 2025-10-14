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


        System.out.println("============Lista de nascidos pós 2001");
        List <Aluno> NascidosPos2001 = ListaAlunos.stream().filter(Utilitarios::isNascidosPos2001).toList();
        IntStream.range(0, NascidosPos2001.size()).forEach(i -> {
           Aluno aluno = NascidosPos2001.get(i);
            System.out.printf("Nome: %s, Data de nascimento: %s", aluno.getNomeCompleto(), aluno.getDataNascimento());
        });

        System.out.println("============Lista de alunos cadastrados pós 18 horas============");
        Set  <Aluno> CadastradosPos18hrs = ListaAlunos.stream().filter(Utilitarios::isCadastradosPos18hrs).collect(Collectors.toCollection(LinkedHashSet::new));
        IntStream.range(0, CadastradosPos18hrs.size()).forEach(i ->{
            Aluno a = CadastradosPos18hrs.stream().findFirst().get();
            System.out.printf("Nome: %s , Hora de cadastro: %s", a.getNomeCompleto(), a.getDataHoraCadastro());
        });

        System.out.println("============Lista de alunos que não possuem curso============");
        List <Aluno> NaoPossuemCurso = ListaAlunos.stream().filter(Utilitarios::isNaoPossuemCurso).toList();
        IntStream.range(0,NaoPossuemCurso.size()).forEach(i -> {
           Aluno a = NaoPossuemCurso.get(i);
            System.out.printf("Nome: %s com id %d não possue curso", a.getNomeCompleto(), a.getId());
        });

        System.out.println("============Lista de alunos que possuem curso============");
        Set  <Aluno> PossuemCurso = ListaAlunos.stream().filter(Utilitarios::isPossuemCurso).collect(Collectors.toCollection(LinkedHashSet::new));
        IntStream.range (0, PossuemCurso.size()).forEach(i -> {
            Aluno aluno = PossuemCurso.stream().findFirst().get();
            System.out.printf("Nome: %s , Curso: %s ", aluno.getNomeCompleto(), aluno.getCurso().getDescricao());
        });

        System.out.println("============Alunos com mais de 30 e estudam de manhã============");
        List <Aluno> MaisDe30Manha = ListaAlunos.stream().filter(Utilitarios::isverificarPeriodo).filter(Utilitarios::iscalculaIdade30).toList();
        IntStream.range(0,MaisDe30Manha.size()).forEach(i -> {
            Aluno a = MaisDe30Manha.get(i);
            System.out.printf("Nome: %s , Data Nascimento: %s , Periodo: &s",a.getNomeCompleto(),a.getDataNascimento(), a.getCurso().getPeriodo());
        });

        Optional <Aluno> primeiroAluno = ListaAlunos.stream().filter(x -> x.getDataHoraCadastro().getYear() == 2021).min(Comparator.comparing(Aluno::getDataHoraCadastro));
        System.out.println("============Primeiro aluno de 2021============");
        if(primeiroAluno.isPresent()){
            System.out.println("primeiroAluno: " + primeiroAluno.get().getNomeCompleto());
        }else {
            System.out.println("Nenhum Aluno encontrado");
        }

        List<Aluno> CadastradosMesmoData = ListaAlunos.stream().filter(Utilitarios::isCadastradosMesmoDiaMes).toList();
            System.out.println("============Cadastrados no mesmo dia e mês============");
            IntStream.range(0, CadastradosMesmoData.size())
                .forEach(i -> {
                    Aluno aluno = CadastradosMesmoData.get(i);
                    System.out.printf("Nome: %s, Numero: %d\n", aluno.getNomeCompleto(), i + 1);
                });




        //converto a data de nascimento pra local date, pra usar o isafter, pra pegar apenas datas apos a data limite
    }
}
