package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.model.Aluno;
import br.edu.fema.atividadesfixacaojava.repository.AlunoRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FiltrarAluno implements Atividade{
    @Override
    public void executar() {

        List < Aluno > ListaAlunos = AlunoRepository.findAll();

        LocalDate DataLimite = LocalDate.of(2001,2,15);
        LocalTime HoraLimite = LocalTime.parse("18:00:00");

        List <Aluno> NascidosPos2001 = ListaAlunos.stream().filter(aluno -> LocalDate.parse(aluno.getDataNascimento(),Utilitarios.formatter).isAfter(DataLimite)).toList();
        Set  <Aluno> CadastradosPos18hrs = ListaAlunos.stream().filter(aluno -> aluno.getDataHoraCadastro().toLocalTime().isAfter(HoraLimite)).collect(Collectors.toCollection(LinkedHashSet::new));
        List <Aluno> NaoPossuemCurso = ListaAlunos.stream().filter(aluno -> aluno.getCurso() == null).toList();
        Set  <Aluno> PossuemCurso = ListaAlunos.stream().filter(aluno -> aluno.getCurso() != null).collect(Collectors.toCollection(LinkedHashSet::new));
        List <Aluno> MaisDe30Manha = ListaAlunos.stream().filter(aluno -> {LocalDate.parse(aluno.getDataNascimento(), Utilitarios.formatter);
            return false;
        } ).toList();


        //converto a data de nascimento pra local date, pra usar o isafter, pra pegar apenas datas apos a data limite
    }
}
