package Lombok;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode (onlyExplicitlyIncluded = true)
@RequiredArgsConstructor
@AllArgsConstructor //um construtor com todos os argumentos
public class Treino02 {

    private String nome;

    @ToString.Exclude
    //@Setter(value = AccessLevel.PRIVATE)
    @EqualsAndHashCode.Include
    private long id;

    private String descricao;
}
