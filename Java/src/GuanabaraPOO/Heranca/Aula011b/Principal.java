package GuanabaraPOO.Heranca.Aula011b;

public class Principal {
    public static void main(String[] args) {

        //herança de implementação
        Visitante visitante = new Visitante();
        visitante.setNome("Maria");
        visitante.setIdade(30);
        visitante.setSexo("f");
        System.out.println(visitante.toString());

        //herança pra diferença abaixo:
        Aluno aluno = new Aluno();
        aluno.setNome("Jhon");
        aluno.setIdade(30);
        aluno.setSexo("m");
        aluno.setMatricula("12345");
        aluno.setCurso("Java");
        aluno.pagarMensalidade();
        System.out.println(aluno.toString());


        //sobrescrever metodos
        Bolsista bolsista = new Bolsista();
        bolsista.setNome("judas");
        bolsista.setIdade(30);
        bolsista.setSexo("f");
        bolsista.setMatricula("123456");
        bolsista.setCurso("Java");
        bolsista.pagarMensalidade();
        System.out.println(bolsista.toString());


    }
}
