package Generics;

public class Caixa <TIPO> //defino um tipo generico
 {
    private TIPO coisa;

    public void guardar(TIPO coisa){
        this.coisa = coisa;
    }

    public TIPO AbrirCaixa(){
        return coisa;
    }

}
