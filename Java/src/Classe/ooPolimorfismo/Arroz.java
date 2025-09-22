package Classe.ooPolimorfismo;

public class Arroz {
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {

        if (peso >= 0){
            this.peso = peso;
        }

    }
}
