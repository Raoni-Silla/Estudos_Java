package Lombok;

import lombok.*;

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode (onlyExplicitlyIncluded = true)
////@NoArgsConstructor //construtor sem argumentos
////@RequiredArgsConstructor//construtor apenas com coisas obrigatorias
//@AllArgsConstructor //um construtor com todos os argumentos

@Data
public class Treino02 {

    private String nome;

    @ToString.Exclude
    //@Setter(value = AccessLevel.PRIVATE)
    @EqualsAndHashCode.Include
    @NonNull
    private Long id;

    private String descricao;
}
