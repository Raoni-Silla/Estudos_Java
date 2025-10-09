package StreamAPI.DesafioMap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Desafio: Mapeamento em Cadeia com Streams (map)
 * Objetivo:
 * Utilizar o método .map() da Stream API para aplicar uma sequência de três transformações em uma lista de números inteiros, convertendo-os para sua representação binária, invertendo-a e reconvertendo o resultado para um inteiro.
 * Dados Iniciais:
 * Comece com a seguinte lista de números inteiros:
 * Java
 * import java.util.Arrays;
 * import java.util.List;
 * List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
 * Requisitos:
 * Você deve criar um pipeline de Stream que aplique os três mapeamentos a seguir, em ordem, a cada número da lista:
 *     Mapeamento 1: Integer -> String (Binária)
 *         Transforme cada número inteiro em sua representação binária como uma String.
 *         Exemplo: O número 6 deve se tornar a String "110".
 *     Mapeamento 2: String -> String (Invertida)
 *         Pegue a String binária do passo anterior e inverta a ordem dos seus caracteres.
 *         Exemplo: A String "110" deve se tornar "011".
 *     Mapeamento 3: String (Binária) -> Integer
 *         Pegue a String binária invertida e converta-a de volta para um número inteiro.
 *         Exemplo: A String "011" (que representa o número binário 3) deve se tornar o Integer 3.
 * Exemplo do Fluxo Completo para o número 6:
 * 6 → map 1 → "110" → map 2 → "011" → map 3 → 3
 * Dicas do Professor:
 *     Para os passos 1 e 3: A classe Integer do Java possui métodos estáticos muito úteis que podem te ajudar tanto a converter um inteiro para uma string binária quanto a converter uma string binária de volta para um inteiro.
 *     Para o passo 2: Para inverter a String, pesquisar sobre a classe StringBuilder pode te dar um caminho rápido e eficiente para resolver o problema.
 * Resultado Esperado:
 * Após aplicar o fluxo de mapeamento em toda a lista inicial, você deve ter uma nova lista de inteiros. Se você imprimir essa nova lista, a saída no console deverá ser:
 * [1, 1, 3, 1, 5, 3, 7, 1, 9]
 * Bom desafio!
 */
public class Desafio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Consumer <Object> println = System.out::println;
        numeros.stream().map(Utilitarios::DecToBi).map(Utilitarios::ReverseString).map(Utilitarios::BiToDec).forEach(println);
    }
}
