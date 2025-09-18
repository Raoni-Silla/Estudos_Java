package EstruturaDeControle;

public class Break2 {
    public static void main(String[] args) {
        //break rotulado
      externo:  for (int i = 0; i < 3; i ++){
           interno: for (int j = 0 ; j < 3; j++){ // deu um nome pros dois laços
                if (i == 1){
                   // break; esse break age apenas no modulo mais interno
                    break externo;

                }
            }
        }
    }
}
