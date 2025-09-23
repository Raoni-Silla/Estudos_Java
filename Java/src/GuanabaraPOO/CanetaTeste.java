package GuanabaraPOO;

public class CanetaTeste {
    public static void main(String[] args) {

        Caneta c1 = new Caneta("Bic", 0.15);
        //chamo o get para pegar o nome do modelo e da ponta
        System.out.println(c1.getPoint());
        System.out.println(c1.getModel());
        c1.status();
    }
}
