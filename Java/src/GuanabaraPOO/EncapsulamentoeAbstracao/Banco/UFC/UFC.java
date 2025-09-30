package GuanabaraPOO.EncapsulamentoeAbstracao.Banco.UFC;

public class UFC {
    public static void main(String[] args) {


        Lutador l [] = new Lutador[5];
        l[0]= new Lutador("Sukuna", "frança", 31,1.75,68.9, 11, 3 , 1 );
        l[1]= new Lutador("satoru gojo", "Brasil", 29, 1.68, 57.8, 14,2,3);
        l[2]= new Lutador("douma", "EUA", 35, 1.65, 80.9, 12, 2,1);
        l[3]= new Lutador("akaza", "Australia", 28, 1.93, 81.6, 13,0,2);

        Lutas UFC01 = new Lutas();
        Lutas UFC02 = new Lutas();
        UFC01.marcarLuta(l[0], l[1]);

        UFC01.lutar();
        System.out.println("======================");
        UFC01.marcarLuta(l[0], l[3]);

    }
}
