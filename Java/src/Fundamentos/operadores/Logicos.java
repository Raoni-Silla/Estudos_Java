package Fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condic1 = true;
        boolean condic2 = 3 > 4;

        System.out.println(condic1 && condic2);
        System.out.println(condic1 || condic2);
        System.out.println(condic1 ^ condic2);

        System.out.println("Tabela da verdade and: ");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("Tabela da verdade or: ");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

    }
}
