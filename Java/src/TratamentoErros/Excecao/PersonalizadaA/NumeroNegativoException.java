package TratamentoErros.Excecao.PersonalizadaA;

public class NumeroNegativoException extends RuntimeException{
    private String nome;
    //se eu tiver um atributo que nao possa ter um numero negativo
    NumeroNegativoException (String nome){
        this.nome = nome;
    }

    public String getMensagem (){
        return String.format("o atributo %s esta negativo",nome);
    }

}
