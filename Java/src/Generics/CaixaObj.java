package Generics;

public class CaixaObj {
    private Object coisa;

    public void guardar(Object coisa){
         this.coisa = coisa;
    }

    public Object AbrirCaixa(){
        return coisa;
    }

}
