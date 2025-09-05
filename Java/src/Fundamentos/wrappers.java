package Fundamentos;

public class wrappers {
    public static void main(String[] args) {

        Byte b = 100;
        Short s = 1000;
        //int
        //converti uma string pra um valor inteiro
        Integer i = Integer.parseInt("1000"); // o literal sempre sera um primitivo
        Long L = 100000L; //mas o long so se converte de long pra long, voce tem que dizer pro java que o literal é um long, pois se nao ele cai em int e o long nao consegue converter
        System.out.println(b.byteValue());
        System.out.println(s.toString()); // transforma o valor para strings

        Boolean bo = Boolean.parseBoolean("true");// converte string pra um valor booleano
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Float f = 123.12F;
        System.out.println(f);
        Double d = 123.25D;
        System.out.println(d);
    }
}
