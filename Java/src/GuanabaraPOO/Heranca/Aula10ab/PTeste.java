package GuanabaraPOO.Heranca.Aula10ab;


/**
 * todas as classes herdam de pessoa
 * ou seja todos tem nome,idade e sexo
 * como atributos pré-definidos(herdados)
 * da super classe, ou seja a subclasse pode
 * ter atributos novos que so ela tem, e ter atributos
 * e metodos comuns a sua super classe
 */

public class PTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("carlos",19 ,"m");
        Aluno p2 = new Aluno("pedro",10 ,"m", 2411550917L, "ads");
        Professor p3 = new Professor("begosso",60 ,"m", "tecnologia", 2.500);
        Funcionario p4 = new Funcionario("jonas", 19, "m", "limpeza");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        p1.fazerAniversario();
        p2.fazerAniversario();
        p3.fazerAniversario();
        //todos podem usar o metodo fazer aniversario pois é comum a superclasse
    }
}
