package Fundamentos.basico;

public class NotacaoPonto {
    public static void main(String[] args) {
        // tudo que for colorido são palavras reservadas da linguagem
        double a = 2.3;
        String s = "Bom dia X";
        s.toUpperCase(); // um metodo que joga todas as letras pra maisculo, nessa linha nao altera o valor original
        System.out.println(s.concat("!!!!:)"));
        System.out.println(s.replace("X","Java")); // troca a primeira palavra pela segunda palavra
        s = s.toUpperCase();
        System.out.println(s);
        System.out.println("Isagui".toUpperCase().concat(":)").length());

        // tipos primitivos nao tem operador ".", como string não é um tipo de dado primitivo de java, ela pode ser usada apartir de metodos acessados com pontos
        int l =4;

    }
}
