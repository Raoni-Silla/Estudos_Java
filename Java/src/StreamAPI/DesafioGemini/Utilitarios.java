package StreamAPI.DesafioGemini;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Utilitarios {

   public static Predicate <Funcionario> FuncionarioClt = F -> F.getContrato().equalsIgnoreCase("clt");
   public static BinaryOperator <Double> sum = (somador, salario) -> somador + salario;
   public static Consumer <Object> println = System.out::println;

   public static Double SalarioNovo (Funcionario funcionario){
       return funcionario.getSalario() * 1.1;
   }
    public static boolean FuncionarioTech(Funcionario f) {
        return f.getSetor().equalsIgnoreCase("tecnologia");
    }


    private Utilitarios(){}
}
