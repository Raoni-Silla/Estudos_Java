package GuanabaraPOO;

public class Caneta {

    public String model;
    private double point;

    Caneta (String model, double point){
        setModel(model);
        setPoint(point);
    }

  public String getModel (){
        return model;
  }

  public void setModel (String m){
        this.model = m;
  }

    public double getPoint (){
        return point;
    }

    public void setPoint (double p){
        if (p >= 0 && p <= 0.50){
            this.point = p;
        }

    }

    public void status (){
        System.out.println("Detalhes tecnicos:");
        System.out.printf("modelo %s", this.getModel());
        System.out.printf("\nponta %.2f", this.getPoint());
    }


}
