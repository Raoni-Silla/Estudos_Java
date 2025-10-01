package GuanabaraPOO.Polimorfismo.Sobrecarga;

public class Dog extends Lobo {



    public void reagir (String frase){


        if(frase.equalsIgnoreCase("toma comida") || frase.equalsIgnoreCase("ola")){
            System.out.println("o dog esta a balançar o rabo e latir");
        }else {
            System.out.println("rosnar");
        }

    }
    public void reagir (int hora, int min){

        if (hora < 12){
            System.out.println("abanar");

        }else if (hora >= 18) {
            System.out.println("Ignorar");
        }else System.out.println("abanar e latir");


    }
    public void reagir (boolean dono){

        if(dono){
            System.out.println("abanar");
        }else {
            System.out.println("rosnar e latir");
        }

    }


    @Override
    public void emitirSom()
    {
        System.out.println("Latido..");
    }
}
