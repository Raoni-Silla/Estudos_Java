package Fundamentos.String;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String vl1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String vl2 = JOptionPane.showInputDialog("Digite o segundo número:");
        // o Joptionpane cria uma janela pra digitar e sempre retorna uma string
        System.out.println(vl1 + vl2);

        double n1 = Double.parseDouble(vl1);
        double n2 = Double.parseDouble(vl2);
        // aqui eu to enviando a string e dizendo que ela explicitamente deve se tornar um double
        double soma = n1 + n2;
        System.out.printf("a soma é %.2f", soma); // aqui ele vai dar um pequeno erro de precisão

        //BigDecimal da um resultado de precisão grande
    }
}
