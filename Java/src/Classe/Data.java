package Classe;

public class Data {
    Integer dia;
    Integer mes;
    Integer ano;

    String obterDataFormatada (){

       String diaS = dia.toString();
       String mesS = mes.toString();
       String anoS = ano.toString();

       String dataFormatada = diaS + "/" + mesS + "/" + anoS;

       return dataFormatada;

    }
}
