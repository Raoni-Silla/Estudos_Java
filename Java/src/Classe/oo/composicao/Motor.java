package Classe.oo.composicao;

public class Motor {

    boolean ligado = false;
    double fatorInjecao = 1;

    int giros (){
        if (!ligado){
            return 0;
        }
        return (int) fatorInjecao * 3000;
    }
}
