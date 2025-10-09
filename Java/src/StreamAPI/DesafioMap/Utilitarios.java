package StreamAPI.DesafioMap;

public class Utilitarios {
    private Utilitarios() {}

    public static String DecToBi (Integer numero) {
        return Integer.toBinaryString(numero);
    }

    public static String ReverseString (String str) {
        StringBuilder sb = new StringBuilder(str).reverse();
        return sb.toString();
    }

    public static Integer BiToDec (String str) {
        return Integer.parseInt(str, 2);
    }
}
