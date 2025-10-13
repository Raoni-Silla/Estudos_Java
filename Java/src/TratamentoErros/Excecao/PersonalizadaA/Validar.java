package TratamentoErros.Excecao.PersonalizadaA;

public class Validar {
    private Validar(){}

    public static void User (Aluno aluno){
        //vou chamar validar aluno e ele vai validar as informações de aluno
        if (aluno == null){
            throw new IllegalArgumentException("O aluno esta nulo");
        }

        if (aluno.nome == null || aluno.nome.trim().isEmpty()){
            throw new StringVaziaException("nome");
        }

        if (aluno.nota < 0 || aluno.nota > 10){
            throw new NumeroForaDoIntervaloException("nota");
        }
    }


}
