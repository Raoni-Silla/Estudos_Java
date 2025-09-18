package EstruturaDeControle;

public class For3 {

    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10;i++){
            System.out.println(i);
        }
        System.out.println(i); // a variavel i nao é vista pelo java, pois foi criada dentro do for, fica como uma variavel privada

        for (i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                System.out.println(i + "e" + j);

            }
        }
    }
}
