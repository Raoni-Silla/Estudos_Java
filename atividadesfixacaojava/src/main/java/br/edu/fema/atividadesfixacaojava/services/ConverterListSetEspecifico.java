package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.model.Aluno;
import br.edu.fema.atividadesfixacaojava.repository.AlunoRepository;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ConverterListSetEspecifico implements  Atividade{
    @Override
    public void executar() {
        List<Aluno> listaAlunos = AlunoRepository.findAll();
        //linkedhashset deixa os dados na ordem de inserção da mesma forma que tava na lista
        listaAlunos.stream().collect(Collectors.toCollection(LinkedHashSet::new)).forEach(Utilitarios::printUtil);
    }
}