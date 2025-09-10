package Classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(int diaInicial, int mesInicial, int anoInicial){

        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;

    }
    Data(){
        dia = 01; // dia padrao
        mes = 01; //mes padrao
        ano = 1970; //ano padrao
    }

    String obterDataFormatada (){

        return String.format("%d/%d/%d", dia, mes, ano); //o metodo format formata como se fosse um printf

    }
}
