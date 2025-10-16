package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.model.Aluno;
import br.edu.fema.atividadesfixacaojava.repository.AlunoRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IterarComForEach implements Atividade{
    @Override
    public void executar() {
        List<Aluno> alunos = AlunoRepository.findAll();
        Map<Long,List<Aluno>> MapaAlunos = alunos.stream().collect(Collectors.groupingBy(Aluno::getId));

        System.out.println("\n============Iterar com o forEach.============");
        MapaAlunos.forEach((idAluno, aluno) -> {
            System.out.println("\nAluno com id: " + idAluno);
            aluno.forEach(aluno1 -> System.out.println("  -Aluno: " + aluno1.getNomeCompleto() + " - " + aluno1.getDataNascimento()));
        });

        System.out.println("\n============Iterar com o forEach (sem usar a API de Stream, Programação Funcional e Method Reference).============");
        for (Map.Entry<Long, List<Aluno>> entry : MapaAlunos.entrySet()) {

            Long idDoAluno = entry.getKey();

            List<Aluno> listaDeAlunos = entry.getValue();

            System.out.println("\nAluno com id: " + idDoAluno);

            for (Aluno aluno : listaDeAlunos) {
                System.out.println("  - Aluno: " + aluno.getNomeCompleto());
            }
        }


    }
}
