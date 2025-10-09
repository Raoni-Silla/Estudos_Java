package StreamAPI;

public class MediaTeste {
    public static void main(String[] args) {
        Media media = new Media().adicionar(8.3).adicionar(6.7);
        Media media2 = new Media().adicionar(7.9).adicionar(6.6);
        System.out.println(media.getValor());
        System.out.println(media2.getValor());

        System.out.println(Media.combinar(media, media2).getValor());
    }

}
