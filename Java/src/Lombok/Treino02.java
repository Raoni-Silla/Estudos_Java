package Lombok;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Treino02 {

    private String nome;

    @ToString.Exclude
    @Setter(value = AccessLevel.PRIVATE)
    private long id;

    private String descricao;
}
