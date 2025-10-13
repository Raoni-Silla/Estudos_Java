package Generics;

public class CaixaObjTeste {
    public static void main(String[] args) {
        CaixaObj caixaObj = new CaixaObj();
        caixaObj.guardar(2.4);
        Integer coisa = (Integer) caixaObj.AbrirCaixa();
        System.out.println(coisa);
    }
}
