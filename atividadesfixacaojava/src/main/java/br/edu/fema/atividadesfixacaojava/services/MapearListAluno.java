package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.model.Aluno;
import br.edu.fema.atividadesfixacaojava.repository.AlunoRepository;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MapearListAluno implements Atividade  {
            @Override
            public void executar() {

                List<Aluno> listaAlunos = AlunoRepository.findAll();
                listaAlunos.stream().map(Aluno::getNomeCompleto).forEach(System.out::println);
                List<Integer> idades = new ArrayList<>();
                List <LocalDate> DataNascimentos = new ArrayList<>();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                for(Aluno aluno : listaAlunos) {
                    LocalDate nascimento = LocalDate.parse(aluno.getDataNascimento(), formatter);
                    DataNascimentos.add(nascimento);
                    Integer idade = Period.between(nascimento, LocalDate.now()).getYears();
                    idades.add(idade);
                }

                idades.forEach(System.out::println);
            }
}
