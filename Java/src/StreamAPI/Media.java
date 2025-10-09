package StreamAPI;

public class Media {
    private double total;
    private int qntd;

    public Media adicionar (double valor){
        total+=valor;
        qntd++;
        return this;
    }

    public double getValor(){
        return total / qntd;
    }

    public static Media combinar (Media m1, Media m2){
        Media resultante = new Media();
        resultante.qntd += m1.qntd + m2.qntd;
        resultante.total += m1.total+m2.total;
        return resultante;
    }
}
