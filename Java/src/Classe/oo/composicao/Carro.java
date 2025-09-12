package Classe.oo.composicao;

public class Carro {
    Motor motor = new Motor();//Cada carro criado tem seu motor


    void acelerar (){
        motor.fatorInjecao += 0.4;

    }

    void freiar (){
        motor.fatorInjecao -= 0.4;
    }

    void ligar (){
        motor.ligado = true;
    }

    void  desligar (){
        motor.ligado = false;
    }

    boolean estaligado (){
        return motor.ligado;
    }
}
