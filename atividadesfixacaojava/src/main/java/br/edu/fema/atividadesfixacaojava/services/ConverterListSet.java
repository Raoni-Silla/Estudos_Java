package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.model.Aluno;
import br.edu.fema.atividadesfixacaojava.repository.AlunoRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConverterListSet {
    public static void main(String[] args) {

        List<Aluno> listaAlunos = AlunoRepository.findAll();
        Consumer <Object> println = System.out::println;
        listaAlunos.stream().collect(Collectors.toSet()).forEach(println);

    }
}
