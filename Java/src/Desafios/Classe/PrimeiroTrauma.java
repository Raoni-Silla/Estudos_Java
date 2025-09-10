package Desafios.Classe;

public class PrimeiroTrauma {
    int a =3; //nao pode mexer aqui

    public static void main(String[] args) {
        // como estou dentro de um static, é um metodo que pertence a classe primeiro trauma, entao pra acessar um atributo dela, eu preciso instanciar um objeto dessa classe
        PrimeiroTrauma a = new PrimeiroTrauma();// instanciei um objeto da classe primeiro trauma
        //pode mexer aqui
        System.out.println(a.a); //pode mexer aqui
        //pode mexer aqui
        // mesmo estando dentro da classe eu so consigo acessar um mebro de instancia apartir de um metodo estatico se eu criar uma[
       // instancia
    }
}
