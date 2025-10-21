package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.model.Aluno;
import br.edu.fema.atividadesfixacaojava.repository.AlunoRepository;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

public class DatasCadastroComOrdemMista implements Atividade{

    @Override
    public void executar() {
        List<Aluno> listaAlunos = AlunoRepository.findAll();
        List<LocalDateTime> Lista =  listaAlunos.stream().sorted(Comparator.comparing((Aluno aluno) -> aluno.getDataHoraCadastro().toLocalDate()).reversed().thenComparing((aluno -> aluno.getDataHoraCadastro().toLocalTime()))).map(Aluno::getDataHoraCadastro).toList();
        Lista.forEach(a -> System.out.println(a.toString()));
    }

}
