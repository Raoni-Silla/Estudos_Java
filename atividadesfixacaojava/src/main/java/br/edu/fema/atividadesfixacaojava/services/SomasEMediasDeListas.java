package br.edu.fema.atividadesfixacaojava.services;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class SomasEMediasDeListas implements Atividade{

    @Override
    public void executar() {
        List<Integer> notas1 = Arrays.asList(1,5,6,8,2);
        System.out.println("\nDo tipo Integer com 2 a 5 valores e somá-los (retorno: BigDecimal).");
        BigDecimal somatorio = notas1.stream().map(BigDecimal::valueOf).reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
        System.out.println("\nSoma do primeiro array: " + somatorio);

        System.out.println("\nDo tipo Double com 2 a 5 valores e somá-los (retorno: Optional<Double>).");
        List<Integer> notas2 = Arrays.asList(1,7,9,10);
        Optional <Double> somatorio2 = notas2.stream().map(Double::valueOf).reduce(Double::sum);
        somatorio2.ifPresent(a -> System.out.println("\nSoma do segundo array: " + a));

        List<Double> media = Arrays.asList(1.5,8.5,10.0,7.0);
        System.out.println("\nDo tipo Double com 2 a 5 valores, transformá-los em números inteiros");
        System.out.println("(sem usar o método \"map\". Métodos nomeados com \"mapTo\" são permitidos) \ne fazer a média (retorno: OptionalDouble).");
        //ooO double::intValue trunca os valores, por isso do resultado 6.5 e nao 6.75
        OptionalDouble medias = media.stream().mapToInt(Double::intValue).average();

        if (medias.isPresent()) {
            System.out.println("\nMedia: "+medias.getAsDouble());
        }

    }
}
