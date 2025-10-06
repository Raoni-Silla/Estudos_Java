package Lambdas.Desafio;

public class Product {
    private final String name;
    private final double price;
    private int amount;
    final static double discount= 0.20;

    Product(String name, double price){
        this.name = name;
        this.price = price;
        setAmount(25);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {

        if (amount < 0) {
            throw new IllegalArgumentException("Quantidade deve ser um positivo");
        }else if (amount > 0){
            this.amount = amount;
        }
    }
}
