package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.model.Aluno;
import br.edu.fema.atividadesfixacaojava.repository.AlunoRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MapearListAluno implements Atividade  {
            @Override
            public void executar() {

                List<Aluno> listaAlunos = AlunoRepository.findAll();
                List<Integer> idades;
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                List<LocalDate> DatasNascimentos = Utilitarios.extrairDatasNascimento(listaAlunos);

                idades = Utilitarios.calculaIdade(DatasNascimentos);

                IntStream.range(0, listaAlunos.size())
                        .forEach(i -> {
                            Aluno aluno = listaAlunos.get(i);
                            Integer idade = idades.get(i);
                            System.out.printf("Nome: %s, Idade: %d\n", aluno.getNomeCompleto(), idade);
                        });

                //listaAlunos.stream().map(Aluno::getNomeCompleto);
                //idades.forEach(System.out::println);
            }
}
