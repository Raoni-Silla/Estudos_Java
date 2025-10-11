package br.edu.fema.atividadesfixacaojava.services;

import br.edu.fema.atividadesfixacaojava.model.Aluno;
import br.edu.fema.atividadesfixacaojava.repository.AlunoRepository;

import java.util.List;

public class MapearListAluno  {
    public static void main(String[] args) {
        List<Aluno> listaAlunos = AlunoRepository.findAll();

    }
}
