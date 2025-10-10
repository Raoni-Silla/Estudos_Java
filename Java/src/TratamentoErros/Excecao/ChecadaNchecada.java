package TratamentoErros.Excecao;

public class ChecadaNchecada {
    public static void main(String[] args) {
        try {
            gerarErro1();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }


        try {
            gerarErro2();
        }catch (Exception e){
            System.out.println("erro 2");
        }

        System.out.println("fim");
    }

    //nao basta eu instanciar uma exceção
    static void gerarErro1 (){
        //um erro precisa ser lançado, n basta instanciar
        //use o throw pra lançar
        //só posso usar o throw pra filhos de throwble
        throw new RuntimeException("Ocorreu um erro");
        //runtimeexception tenho uma exceção não checada
        //o compilador me da a escolha se eu quero ou nao tratar o erro
    }

    //exceção checada
    //preciso declarar que nesse metodo eu lanço essa exceção
    static void gerarErro2 () throws Exception{
        try {
            throw new Exception("Ocorreu um erro 02");
        }catch (Exception e){
            System.out.println("erro 2");
        }

        //essa é uma exceção checada, e eu sou obrigado a por na assinatura do metod
        //q eu lanço essa exceçãoi
    }
}
