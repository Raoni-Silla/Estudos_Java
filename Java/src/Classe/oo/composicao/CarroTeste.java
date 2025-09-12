package Classe.oo.composicao;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c = new Carro();

        System.out.println(c.estaligado());

        c.ligar();
        System.out.println(c.estaligado());

        System.out.println(c.motor.giros());


    }
}
