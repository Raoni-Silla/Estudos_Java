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

public class AgruparAlunosPorCriterios implements Atividade{
    @Override
    public void executar() {
        List<Aluno> listaAlunos = AlunoRepository.findAll();
        Map<Boolean,List<Aluno>> BeneficientesEnaoBeneficientes =listaAlunos.stream().collect(Collectors.groupingBy(Aluno::getPossuiAlgumTipoDeBeneficio));
        Map<Month, List<Aluno>> MesDataNascimento = listaAlunos.stream().collect(Collectors.groupingBy((Aluno a) -> LocalDate.parse(a.getDataNascimento(),Utilitarios.formatter).getMonth()));
        Map<Year, List<Aluno>> AnoDataNascimento = listaAlunos.stream().collect(Collectors.groupingBy((Aluno a) -> Year.of(LocalDate.parse(a.getDataNascimento(), Utilitarios.formatter).getYear())));
        Map<YearMonth, List<Aluno>> MesEanoNascimento = listaAlunos.stream().collect(Collectors.groupingBy((Aluno a) -> {
            LocalDate data = LocalDate.parse(a.getDataNascimento(), Utilitarios.formatter);
            return YearMonth.of(data.getYear(), data.getMonth());
        }));

    }
}
