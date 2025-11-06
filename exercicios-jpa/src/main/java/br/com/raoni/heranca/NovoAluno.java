package br.com.raoni.heranca;

import br.com.raoni.infra.DAO;

public class NovoAluno {
    public static void main(String[] args) {
        DAO<Aluno> dao = new DAO<>();
        Aluno aluno = new Aluno(123,"jonh");
        AlunoBolsista alunoBolsista = new AlunoBolsista(1234, "Mary",1000.0);

        dao.abrirTransacao().incluir(aluno).incluir(alunoBolsista).fecharTransacao().fecharEm();
    }
}
