package Classe.ooEncapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(-40);
        p1.setIdade(-20);
        p1.setNome("carl");

         // alterar
        //n existe nenhum mecanismo pelo fato deo atributo ser publico
        // qlqr lugar do codigo pode mexer nela, sem ter filtro ou validação

        System.out.println(p1.getIdade()); //ler

        //quando eu tenho um atributo se faz dois tipos de operação
        //alterar ou ler o valor dela
        System.out.println(p1.toString());
    }
}
