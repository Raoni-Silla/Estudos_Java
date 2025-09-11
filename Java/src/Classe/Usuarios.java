package Classe;

public class Usuarios {

    String nome;
    String email;


    @Override
    public boolean equals(Object obj) {
        // aqui eu tenho um Object obj, um objeto da classe objeto
        //ai nisso eu comparo com o instanceof se o objeto que caiu dentro de obj é instanciado da classe Usuarios
        //se sim ele entra no loop, instanciando um objeto da classe Usuarios com nome outros
        //ai Outros = (cast Usuarios) obj; <- entao aqui obj é convertido explicitamente pro tipo usuarios pra guardar outros
        //ai eu pergunto se o objeto passado como parametro é um objeto da classe Usuarios?
        //se sim executa o if
        if (obj instanceof Usuarios) {

            Usuarios outros = (Usuarios) obj; //convertendo uma classe object(generica) pra um tipo de classe usuarios, fazendo um cast

            //eu crio uma variavel do tipo booleano
            // dou nomeigual
            //essa variavel recebe outros.nome
            //ou seja, o objeto outros que foi instanciado da classe Usuarios
            // aonde esse objeto recebou os parametros de obj fazendo um cast para a classe usuarios
            // ai eu acesso um atributo desse objetos outros, que é o nome
            //pergunto se o nome é igual ao o atributo do objeto instanciado

            boolean nomeIgual = outros.nome.equals(this.nome); //usa o equals para comparar
            boolean emailIgual = outros.email.equals(this.email);
            return nomeIgual && emailIgual;


        }else return false;

    }
}


