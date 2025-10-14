package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.model.Aluno;
import br.edu.fema.atividadesfixacaojava.repository.AlunoRepository;

import java.util.*;
import java.util.stream.Collectors;

public class FiltrarAluno implements Atividade{
    @Override
    public void executar() {

        List < Aluno > ListaAlunos = AlunoRepository.findAll();





        List <Aluno> NascidosPos2001 = ListaAlunos.stream().filter(Utilitarios::isNascidosPos2001).toList();
        Set  <Aluno> CadastradosPos18hrs = ListaAlunos.stream().filter(Utilitarios::isCadastradosPos18hrs).collect(Collectors.toCollection(LinkedHashSet::new));
        List <Aluno> NaoPossuemCurso = ListaAlunos.stream().filter(Utilitarios::isNaoPossuemCurso).toList();
        Set  <Aluno> PossuemCurso = ListaAlunos.stream().filter(Utilitarios::isPossuemCurso).collect(Collectors.toCollection(LinkedHashSet::new));
        List <Aluno> MaisDe30Manha = ListaAlunos.stream().filter(Utilitarios::isverificarPeriodo).filter(Utilitarios::iscalculaIdade30).toList();

        Optional <Aluno> primeiroAluno = ListaAlunos.stream().filter(x -> x.getDataHoraCadastro().getYear() == 2021).min(Comparator.comparing(Aluno::getDataHoraCadastro));

        if(primeiroAluno.isPresent()){
            System.out.println("primeiroAluno: " + primeiroAluno.get().getNomeCompleto());
        }else {
            System.out.println("Nenhum Aluno encontrado");
        }

        List <Aluno> cadastradosMesmoDiaMes = ListaAlunos.stream().filter(Utilitarios::isCadastradosMesmoDiaMes).toList();


        //converto a data de nascimento pra local date, pra usar o isafter, pra pegar apenas datas apos a data limite
    }
}
