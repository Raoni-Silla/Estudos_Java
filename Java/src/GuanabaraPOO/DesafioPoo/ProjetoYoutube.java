package GuanabaraPOO.DesafioPoo;

import GuanabaraPOO.DesafioPoo.Gafanhoto.Gafanhoto;
import GuanabaraPOO.DesafioPoo.VideoPack.Video;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v [] = new Video[3];
        v [0] = new Video ("JavaPoo");
        v [1] = new Video ("Python");
        v [2] = new Video ("JavaScript");
        System.out.println(v[0].toString());

        Gafanhoto g [] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Jonas", "M", 22, "jubs@gmail.com");
        g[1] = new Gafanhoto("jujubs", "M", 22, "juju@hotmail.com");
        System.out.println(g[1].toString());


    }
}
