package Fundamentos.Tipos;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {
        String s = "texto"; // a string é uma classe assim como primitivovsobjeto tbm é
        //no momento que vc cria um valor pra uma classe, nos dizemos que esse valor criado para classe é um objeto, tendo atributos e comportamentos
        s.toUpperCase();//comportamento do objeto string que foi criado com valor texto

        int a = 123;// voce nao tem nenhum comportamento associado a um tipo primitivo
        //o tipo primitivo só carrega dentro dele um valor
        // mas se eu precisar que um valor numerico tenha um comportamento associado
        // ai se usa wrappers, aquilo que envolve, versao objeto dos tipos primitivos. e pra cada tipo tem wrappers
        // tudo em java é baseado em classes com exceções de tipos primitivos
        //todoquando vc cria objetos de uma determinada classes nele vai ter comportamentos e atributos


    }
}
