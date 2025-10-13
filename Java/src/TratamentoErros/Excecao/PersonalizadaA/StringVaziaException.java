package TratamentoErros.Excecao.PersonalizadaA;

public class StringVaziaException extends RuntimeException {
    private String nome;
    //se eu tiver um atributo que nao possa ter um numero negativo
    StringVaziaException (String nome){
        this.nome = nome;
    }

    @Override
    public String getMessage() {
        return String.format("o atributo %s esta vazio",nome);
    }
}
