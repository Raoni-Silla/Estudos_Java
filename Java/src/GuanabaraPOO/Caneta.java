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
        this.point = p;
    }



}
