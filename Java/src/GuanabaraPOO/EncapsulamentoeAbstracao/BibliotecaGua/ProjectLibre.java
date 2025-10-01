package GuanabaraPOO.EncapsulamentoeAbstracao.BibliotecaGua;

public class ProjectLibre {
    public static void main(String[] args) {
        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro[3];

        p [0] = new Pessoa("joao",12, "masculino");
        p [1] = new Pessoa("maria",13, "feminino");
        l [0] = new Livro("atack on titan", "kashimoto", 200, p[0]);
        l [1] = new Livro("Ben 10", "marcos", 900, p[0]);
        l [2] = new Livro("commit", "marcos", 900, p[1]);
        System.out.println(l[0].toString());
        System.out.println(l[1].toString());
        System.out.println(l[2].toString());
        l [0].abrir();
        l [1].abrir();
    }
}
