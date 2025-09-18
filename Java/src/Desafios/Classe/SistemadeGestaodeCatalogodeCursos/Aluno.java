package Desafios.Classe.SistemadeGestaodeCatalogodeCursos;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno {
    String nome;
    final String RA;
    ArrayList <Curso> cursosMatriculado;

    Aluno (String nome, String RA){
        this.nome = nome;
        this.RA = RA;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(RA, aluno.RA);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(RA);
    }
}
