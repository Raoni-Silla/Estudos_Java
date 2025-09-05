package Fundamentos;

public class TipoString {
    public static void main(String[] args) {


        System.out.println("Hello, World!".charAt(2)); //qual a letra do indice dois, apartir de um valor literal voce consegue chamar as funcionalidades da string

        String s = "Boa tarde"; //string é um valor imutavel, vc nao consegue mais mudar o valor original, voce pode substituir mas nao modificar o valor original
        System.out.println(s.concat("!!!"));
        System.out.println(s.startsWith("Boa")); //pergunta se a string começa com a palavra boa, porem se na string original tiver uma letra maiuscula, nao vai dar pra comparar, precisando jogar pra minusculo e depois comparar
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toLowerCase().endsWith("tarde")); //termina com tarde
        System.out.println(s.length()); // ve o tamanho da string
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("ele ignora letras maisculas e minusculas"));



        var nome = "pedro"; // quando se usa o var, o java entende textos como tipo string
        var sobrenome = "santos";
        var idade = 18;
        var sal = 1.500;
        System.out.printf("Nome: %s %s com idade de %d com o salario de R$: %.3f\n", nome, sobrenome, idade, sal); // printf serve pra printar de forma
        //como %d para inteiros ou %f para ponto flutuante
        //%f.3f digo que é uma string do tipo float com 3 casas decimais
        String frase = String.format("Nomea2: %s %s com idade de %d com o salario de R$: %.3f", nome, sobrenome, idade, sal);

        System.out.println(frase);

        System.out.println("frase qualquer".contains("qual"));//dentro da frase tem a palavra qual
        System.out.println("frase qualquer".indexOf("qual"));// a string qual comeca em que casa do vetor
        System.out.println("frase qualquer".substring(6)); //pega a sexta letra pra frente
        System.out.println("frase qualquer".substring(6,8));// pega a sexta letra até um numero antes de chegar no range maximo, pegando até o 8
    }
}
