package GuanabaraPOO.EncapsulamentoeAbstracao.Bank;

public class Owner {
      String name;
      int age;


    Owner(String nome, int idade){
        setName(nome);
        setAge(idade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
