package Classe;

import java.util.Scanner;

public class DataTeste {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);


        // inicio dos estudos de construtores, classes e objetos:
        Data data1 = new Data();
        Data data2 = new Data();


            System.out.println("Digite o dia da primeira data:");
            data1.dia = cin.nextInt();
            System.out.println("Digite o mes da primeira data:");
            data1.mes = cin.nextInt();
            System.out.println("Digite o ano da  primeira data:");
            data1.ano = cin.nextInt();
            System.out.println("Digite o dia da segunda data:");
            data2.dia = cin.nextInt();
            System.out.println("Digite o mes da segunda data:");
            data2.mes = cin.nextInt();
            System.out.println("Digite o ano segunda data:");
            data2.ano = cin.nextInt();

        String dataformatada1 = data1.obterDataFormatada();
        String dataformatada2 =  data2.obterDataFormatada();

        System.out.println(dataformatada1);
        System.out.println(dataformatada2);




        //objetos com construtores diferentes:
        System.out.println("Construtores diferentes: ");
        Data data3 = new Data(); //instancia uma data com construtor padrao
        String data3formatada = data3.obterDataFormatada(); //chamo o metodo data formatada para formatar a data padrao
        System.out.println(data3formatada); //imprimo
        Data data4 = new Data(05,06,2006); //chamo o outro construtor, e passo os valores pra ele
        String data4formatada = data4.obterDataFormatada(); //formato no metodo
        System.out.println(data4formatada);//chamo o print
        cin.close();
    }
}
