package Classe;

public class EqualsHash {
    public static void main(String[] args) {
        Usuarios user1 = new Usuarios();
        user1.nome = "Pedro cadete da silva";
        user1.email= "pedrocadete@gmail.com";

        Usuarios user2 = new Usuarios();
        user2.nome = "Pedro cadete da silva";
        user2.email= "pedrocadete@gmail.com";

        System.out.println(user1 ==  user2);//doois objetos distintos em memoria

        System.out.println(user1.equals(user2));//toda instancia criada tem equals a disposição
        //porem tbm vai dar falso, fazendo a mesma coisa de ==
        System.out.println(user2.equals(user1));
        //todas acima deram falsas pq o equals por padrao vem com a mesma comparação que ==
    }
}
