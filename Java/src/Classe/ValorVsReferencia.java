package Classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; //atribuição por valor, uma copia do valor é definido na memoria
        System.out.println(a);
        a++;
        b--;
        System.out.println(a + " " + b); //elas alteram o valor da variavel em memoria

        Data data1 = new Data(01, 02,2003);
        Data data2 = data1;//aqui data 2 passa apontar a referencia do mesmo objeto de data1
        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());

        voltarDataParaValorPadrao(data1);

        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());

        int c = 5;
        alterarPrimitivo(5);
        System.out.println(c);

    }
    //o ideal é que nao mexa nos atributos que eu recebi como parametro
    static void voltarDataParaValorPadrao (Data d){
        d.dia = 1;
        d.ano = 1970;
        d.mes = 1;
    }
    //primitivo sempre sera feito atribuição por copia na memoria
    //nao gerando impacto pra fora
    static void alterarPrimitivo (int a){
        a++;
    }
}
