package TratamentoErros.Excecao;

import StreamAPI.Aluno;

public class Basico {
    public static void main(String[] args) {
        //preciso de um try ou um catch
        Aluno a1 = null;
        try {
            //nullpointerexception
            //esse é um tipo de exceção que nao tem mensagem associada
            imprimirAluno(a1);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome");
        }

        //nao é ideal tratar erros de formas genericas e sim especificas
        try {
            System.out.println(7 / 0);// <- isso da um erro
        } catch (ArithmeticException e) {
            //sempre tratar de forma especifica pra ser mais relevante
            //e.printStackTrace(); //imprime a pilha de execução
            System.out.println("Ocorreu o erro: " + e.getMessage()); //pega a mensagem de erro se tiver
        }
        System.out.println("fim");
    }

    //um bloco try tem um codigo que pode gerar um erro e eu posso tratar o erro no catch
    //posso gerar uma mensagem ou gerar outro erro
    //posso silenciar uma exceção, colocando um bloco catch vazio
    //é simplesmente calar o erro
    //posso salvar toda a mensagem de erro em um arquivo texto
    //erros que o usuario nao precisa ficar sabendo


    public static void imprimirAluno (Aluno aluno) {

        System.out.println(aluno.getNome());
        //metodo vulneravel pq posso passar um aluno nulo

    }
}
