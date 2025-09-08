package Fundamentos.operadores;

public class ternarios {
    public static void main(String[] args) {
        double media = 7.6;
        // expressão ? caso verdadeiro : caso falso
        String resultado = media >= 7.0 ? "aprovado": "reprovado";

        System.out.printf("O aluno esta %s", resultado);

    }
}
