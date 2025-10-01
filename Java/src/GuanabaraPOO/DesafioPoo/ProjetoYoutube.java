package GuanabaraPOO.DesafioPoo;

import GuanabaraPOO.DesafioPoo.Gafanhoto.Gafanhoto;
import GuanabaraPOO.DesafioPoo.VideoPack.Video;
import GuanabaraPOO.DesafioPoo.Visu.Visualizacao;

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

        Visualizacao vis [] = new Visualizacao [3];

            vis[0] = new Visualizacao(v[1],g[0]);
            System.out.println(vis[0].toString());
            vis [0].avaliar(35);
            vis [0].avaliar(35);
            vis [0].avaliar(35);
            System.out.println(vis [0].toString());
            vis [1] = new Visualizacao(v[2],g[1]);
            System.out.println(vis [1].toString());



    }
}
