package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.model.Aluno;
import br.edu.fema.atividadesfixacaojava.repository.AlunoRepository;

import java.util.Comparator;
import java.util.List;


public class CompararListAluno implements Atividade{
    @Override
    public void executar() {
        List <Aluno> listaAluno = AlunoRepository.findAll();
        //listaAluno.stream().sorted(Comparator.comparing(Aluno::getDataHoraCadastro).reversed()).findFirst().ifPresent(System.out::println);
        listaAluno
                .stream()
                .max(Comparator.comparing(Aluno::getDataHoraCadastro))
                .ifPresent(aluno -> System.out.printf("\nNome do ultimo aluno cadastrado %s , Hora Do Cadastro: %s ", aluno.getNomeCompleto(), aluno.getDataHoraCadastro()));
    }
}
