package EstruturaDeControle;

public class Switch1 {
    public static void main(String[] args) {
        String faixa = "branca"; // lembrar do brake pra ele executar apenas um case especifico e saia
        switch (faixa){
            case "preta":
                System.out.println("ultima faixa");
            case "marrom":
                System.out.println("Penultima faixa");
            case "roxa":
                System.out.println("terceira faixa");
            case "azul":
                System.out.println("segunda faixa");
            case "branca":
                System.out.println("primeira faixa");

        }
    }
}
