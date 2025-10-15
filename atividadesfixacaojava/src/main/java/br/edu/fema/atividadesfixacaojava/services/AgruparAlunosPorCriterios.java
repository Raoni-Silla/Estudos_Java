package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.model.Aluno;
import br.edu.fema.atividadesfixacaojava.repository.AlunoRepository;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class AgruparAlunosPorCriterios implements Atividade {
    @Override
    public void executar() {
        List<Aluno> listaAlunos = AlunoRepository.findAll();

        System.out.println("\n----------- Beneficiários e não Beneficiários -----------");
        Map<Boolean, List<Aluno>> beneficientesEnaoBeneficientes = listaAlunos.stream()
                .collect(Collectors.groupingBy(Aluno::getPossuiAlgumTipoDeBeneficio));

        beneficientesEnaoBeneficientes.forEach((beneficiario, alunos) -> {
            String status = beneficiario ? "Beneficiários" : "Não Beneficiários";
            System.out.println("\n--- Grupo: " + status + " ---");
            alunos.forEach(aluno -> System.out.println("  - " + aluno.getNomeCompleto()));
        });


        System.out.println("\n----------- Mês de Nascimento -----------");
        Map<Month, List<Aluno>> mesDataNascimento = listaAlunos.stream()
                .collect(Collectors.groupingBy(aluno -> LocalDate.parse(aluno.getDataNascimento(), Utilitarios.formatter).getMonth()));

        mesDataNascimento.forEach((mes, alunos) -> {
            System.out.println("\n--- Nascidos em: " + mes + " ---");
            alunos.forEach(aluno -> System.out.println("  - " + aluno.getNomeCompleto()));
        });


        System.out.println("\n----------- Ano de Nascimento -----------");
        Map<Year, List<Aluno>> anoDataNascimento = listaAlunos.stream()
                .collect(Collectors.groupingBy(aluno -> Year.from(LocalDate.parse(aluno.getDataNascimento(), Utilitarios.formatter))));

        anoDataNascimento.forEach((ano, alunos) -> {
            System.out.println("\n--- Nascidos em: " + ano + " ---");
            alunos.forEach(aluno -> System.out.println("  - " + aluno.getNomeCompleto()));
        });


        System.out.println("\n----------- Mês e Ano de Nascimento -----------");
        Map<YearMonth, List<Aluno>> mesEanoNascimento = listaAlunos.stream()
                .collect(Collectors.groupingBy(aluno -> YearMonth.from(LocalDate.parse(aluno.getDataNascimento(), Utilitarios.formatter))));

        mesEanoNascimento.forEach((anoMes, alunos) -> {
            System.out.println("\n--- Nascidos em: " + anoMes + " ---");
            alunos.forEach(aluno -> System.out.println("  - " + aluno.getNomeCompleto()));
        });


        System.out.println("\n----------- Possuem Curso ou Não -----------");
        Map<Boolean, List<Aluno>> possueCursoOuNao = listaAlunos.stream()
                .collect(Collectors.groupingBy(aluno -> aluno.getCurso() != null));

        possueCursoOuNao.forEach((possuiCurso, alunos) -> {
            String status = possuiCurso ? "POSSUEM" : "NÃO POSSUEM";
            System.out.println("\n--- Alunos que " + status + " curso ---");
            alunos.forEach(aluno -> System.out.println("  - " + aluno.getNomeCompleto()));
        });
    }
}
