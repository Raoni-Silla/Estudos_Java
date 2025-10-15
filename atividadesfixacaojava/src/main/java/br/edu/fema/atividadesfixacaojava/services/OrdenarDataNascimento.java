package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.model.Aluno;
import br.edu.fema.atividadesfixacaojava.repository.AlunoRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class OrdenarDataNascimento implements Atividade {

    @Override
    public void executar() {
        List < Aluno > listaAlunos = AlunoRepository.findAll();
        LinkedHashSet<Aluno> listaAlunosOrganizada = listaAlunos.stream().sorted(Comparator.comparing((Aluno aluno) -> LocalDate.parse(aluno.getDataNascimento(),Utilitarios.formatter))).collect(Collectors.toCollection(LinkedHashSet::new));
        for (Aluno a : listaAlunosOrganizada) {
           System.out.printf("\nAluno: %s , Data de Nascimento: %s",a.getNomeCompleto(), a.getDataNascimento());
        }
    }
}
