package EstruturaDeControle;

public class Break {
    public static void main(String[] args)
    {   int i;
        for ( i = 0; i < 10; i++){
            if (i==5){
                break; //quebra o fluxo naquele momento, saindo da estrutura atual, nao fazendo sentido dentro de um if, e sim dentro de um laço

            }
        }
        System.out.println(i);
    }

}
