package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.model.Aluno;
import br.edu.fema.atividadesfixacaojava.repository.AlunoRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ConverterListSet implements Atividade{

    @Override
    public void executar (){
        List<Aluno> listaAlunos = AlunoRepository.findAll();
        listaAlunos.stream().collect(Collectors.toSet()).forEach(Utilitarios::printUtil);
    }
}
