package StreamAPI.DesafioMapFilter;

public class Produto {
    private final String nome;
    private final double preco;
    private double desconto;
    private boolean freteGratis;

    Produto (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        setDesconto(preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double preco) {
        if (this.preco > 1.500){
            this.desconto = 0.3;
            setFreteGratis(true);
        }else {
            this.desconto = 0.1;
            setFreteGratis(false);
        }
    }

    public boolean isFreteGratis() {
        return freteGratis;
    }

    public void setFreteGratis(boolean freteGratis) {
        this.freteGratis = freteGratis;
    }
}
