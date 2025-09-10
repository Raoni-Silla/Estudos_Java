package Classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(5.6);
        //a1.PI = 10;
        System.out.println(a1.area());

        AreaCirc a2 = new AreaCirc(5.6);
        //a2.PI = 5; // eu mudei o pi nao para instancia a2, mas para todos os objetos da classe
        System.out.println(a2.area());
        //para cada novo objeto criado eu tenho um valor de PI associado a esta instancia

        AreaCirc.area(100); // dentro da classe area circ, tenho um metodo area estatico que pode ser acessado sem instanciar um objeto

    }
}
