package Desafios;
/*
    1.Contar Caracteres: Crie uma classe com um método que receba uma String e imprima o número de caracteres dela.

        Exemplo: Para a string "Java é incrível!", o resultado deve ser 15.

    2.Verificar Início e Fim: Crie um método que receba uma String e verifique se ela começa com a palavra "Olá" (ignorando maiúsculas e minúsculas) e se termina com a palavra "mundo".

    3.Extrair uma Substring: Crie um método que receba uma frase e extraia a terceira palavra da frase, imprimindo-a.

        Exemplo: Para a frase "O Sol brilha forte", o resultado deve ser "brilha".
* */
public class ExercicioFixacaoString {
    public static void main(String[] args) {
        // exercicio 1:
        String frase = "Lorem dolorem ipsum";
        System.out.printf("a frase contem %s caracteres",frase.length());
        //exercicio 2:
        String hello = "Olá Mundo";
        System.out.printf("A frase começa com [olá] ?: %s \n e termina com [mundo] ?: %s\n", hello.toLowerCase().startsWith("olá"), hello.toLowerCase().endsWith("mundo"));
        //exercicio 3:
        String extrair = "String dope azul lore";
        var quebrado = extrair.indexOf(" ");
        var inicio = extrair.indexOf(" ", quebrado +1);
        var fim = extrair.indexOf(" ", inicio + 1);
        var terceira_palavra = extrair.substring(inicio+ 1, fim);

        System.out.println(quebrado);
        System.out.println(inicio);
        System.out.println(fim);
        System.out.println(terceira_palavra);

    }
}
