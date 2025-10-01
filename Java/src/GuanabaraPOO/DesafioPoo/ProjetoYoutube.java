package GuanabaraPOO.DesafioPoo;

import GuanabaraPOO.DesafioPoo.VideoPack.Video;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v [] = new Video[3];
        v [0] = new Video ("JavaPoo");
        v [1] = new Video ("Python");
        v [2] = new Video ("JavaScript");

        System.out.println(v[0].toString());
    }
}
