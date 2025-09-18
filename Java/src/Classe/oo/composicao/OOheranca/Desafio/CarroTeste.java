package Classe.oo.composicao.OOheranca.Desafio;

public class CarroTeste {

    public static void main(String[] args) {
        Civic civic = new Civic();
        Mercedes mercedesBenz = new Mercedes();

        mercedesBenz.xlr8();
        mercedesBenz.xlr8();
        mercedesBenz.xlr8();

        civic.xlr8();
        civic.xlr8();
        civic.xlr8();

        System.out.println("KM/h mercedes benz => " + mercedesBenz.velAtual);
        System.out.println("KM/h Civic => " + civic.velAtual);

        mercedesBenz.dxlr8();
        mercedesBenz.dxlr8();
        mercedesBenz.dxlr8();

        civic.dxlr8();
        civic.dxlr8();
        civic.dxlr8();

        System.out.println("KM/h mercedes benz => " + mercedesBenz.velAtual);
        System.out.println("KM/h Civic => " + civic.velAtual);

        mercedesBenz.dxlr8();
        mercedesBenz.dxlr8();
        mercedesBenz.dxlr8();
        mercedesBenz.dxlr8();
        mercedesBenz.dxlr8();
        mercedesBenz.dxlr8();

        System.out.println("KM/h mercedes benz => " + mercedesBenz.velAtual);


    }

}
