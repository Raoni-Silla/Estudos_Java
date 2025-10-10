package StreamAPI.DesafioGemini;

import java.util.Arrays;
import java.util.List;

public class Desafio {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Ana", 4000.0, "Tecnologia", "CLT"),
                new Funcionario("Bruno", 8000.0, "Tecnologia", "PJ"),
                new Funcionario("Carlos", 3000.0, "RH", "CLT"),
                new Funcionario("Daniela", 6000.0, "Tecnologia", "CLT"),
                new Funcionario("Eduardo", 7500.0, "Marketing", "PJ"),
                new Funcionario("Fernanda", 2500.0, "Tecnologia", "CLT")
        );

        funcionarios.stream()
                .filter(Utilitarios::FuncionarioTech)
                .filter(Utilitarios.FuncionarioClt)
                .map(Utilitarios::SalarioNovo)
                .reduce(Utilitarios.sum).ifPresent(Utilitarios.println);

    }
}
