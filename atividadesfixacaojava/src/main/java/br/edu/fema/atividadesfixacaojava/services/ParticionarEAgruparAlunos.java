package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.enums.Periodo;
import br.edu.fema.atividadesfixacaojava.model.Aluno;
import br.edu.fema.atividadesfixacaojava.repository.AlunoRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParticionarEAgruparAlunos implements Atividade {
    @Override
    public void executar() {
        List<Aluno> listaAlunos = AlunoRepository.findAll();

        Map<Boolean, Map<String, List<Aluno>>> parte1 = listaAlunos.stream().collect(
                Collectors.partitioningBy(
                        Aluno::getPossuiAlgumTipoDeBeneficio,
                        Collectors.groupingBy(
                                aluno -> {
                                    if (aluno.getCurso() != null) {
                                        return aluno.getCurso().getSigla();
                                    } else {
                                        return "SEM CURSO";
                                    }
                                }
                        )
                )
        );

        Map<Boolean, List<Aluno>> alunosSeparados = listaAlunos.stream().collect(Collectors.partitioningBy(a -> a.getCurso() != null && a.getCurso().getPeriodo() != null));
        List<Aluno> validos = alunosSeparados.get(true);
        List<Aluno> invalidos = alunosSeparados.get(false);

        Map<Boolean, Map<Periodo, Map<String, List<Aluno>>>> listaParticionados = validos.stream().collect(Collectors.partitioningBy(
                        Aluno::getPossuiAlgumTipoDeBeneficio,
                        Collectors.groupingBy(a ->
                                a.getCurso().getPeriodo(),
                                Collectors.groupingBy(a -> a.getCurso().getSigla())
                          )
                        )
                     );
    }
}