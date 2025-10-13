package TratamentoErros.Excecao.PersonalizadaA;

public class Teste {
    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("Ana",-7, true);
            Validar.User(aluno);
        }catch (StringVaziaException e){
            System.out.println(e.getMessage());
        }catch (NumeroForaDoIntervaloException e){
            System.out.println(e.getMessage());
        }

        System.out.println("fim");
    }
}
