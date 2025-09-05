package Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // informações do funcionario
        // tipos numericos inteiros
        // se diferem pela capacidade de armazenamento
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_234_564L; //define que o tipo é long

        // reais
        float salario = 11_445.44F; //VALORES LITERAIS COM PONTO FLUTUANTE FAZ ELES ENTENDEREM QUE É FLOAT, por padrão um literal com ponto flutuante é do tipo double
        double vendasAcumuladas = 2_991_797_103.01; //estudar um pouco mais de tipos primitivos e valores literais

        //tipo booleano
        boolean estaDeFerias = true;

        //tipo caractere
        char status = 'A';

        //dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //numero de viagens
        System.out.println(numeroDeVoos / 2);

        //pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario + " tem ferias?: " + estaDeFerias + "com status " + status);
    }
}
