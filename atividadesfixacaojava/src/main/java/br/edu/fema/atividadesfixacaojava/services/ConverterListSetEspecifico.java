package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.model.Aluno;
import br.edu.fema.atividadesfixacaojava.repository.AlunoRepository;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConverterListSetEspecifico {
    public static void main(String[] args) {
        List<Aluno> listaAlunos = AlunoRepository.findAll();
        //linkedhashset deixa os dados na ordem de inserção da mesma forma que tava na lista
        Consumer <Object> println = System.out::println;
        listaAlunos.stream().collect(Collectors.toCollection(LinkedHashSet::new)).forEach(println);
    }
}
