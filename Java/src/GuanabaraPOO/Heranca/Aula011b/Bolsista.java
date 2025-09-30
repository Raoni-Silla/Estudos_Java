package GuanabaraPOO.Heranca.Aula011b;

public class Bolsista extends Aluno {

    private double bolsa;

    public void renovarBolsa (){
        System.out.println("Renovando bolsa do " + this.getNome());
    }


    @Override
    public void pagarMensalidade(){
        System.out.println("-------------------------------------");
        System.out.println("Pagando mensalidade do " + this.getNome());
        System.out.println("Renovando bolsa do " + this.getNome());
        System.out.println("--------------------------------------");
    }

    public double getBolsa() {
        return bolsa;
    }
    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
