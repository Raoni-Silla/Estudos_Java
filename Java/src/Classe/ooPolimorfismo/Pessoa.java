package Classe.ooPolimorfismo;

public class Pessoa {

    private double peso;


    public void comer (Arroz arroz){
        this.peso += arroz.getPeso();
    }
    public void comerFeijao (Feijao feijao){
        this.peso += feijao.getPeso();
    }
    public void comerSor (Sorvete sorvete){
        this.peso += sorvete.getPeso();
    }

    public Pessoa (double peso){
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {

        if (peso >= 0){
            this.peso = peso;
        }

    }



}
