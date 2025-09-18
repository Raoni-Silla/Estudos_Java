package Classe.oo.composicao.OOheranca.Desafio;

public class CarroTeste {

        public static void main(String[] args) {

            Civic civic = new Civic(210);
            Mercedes mercedes = new Mercedes(320);

            System.out.println("--- ACELERANDO ---");
            // Acelera ambos 3 vezes
            for(int i = 0; i < 3; i++) {
                civic.xlr8();
                mercedes.xlr8();
            }
            System.out.println("Velocidade do Civic: " + civic.velAtual + " km/h");      // Esperado: 15
            System.out.println("Velocidade da Mercedes: " + mercedes.velAtual + " km/h");  // Esperado: 45

            System.out.println("\n--- TESTANDO O LIMITE DE VELOCIDADE ---");
            // Acelera a Mercedes até o limite
            for (int i = 0; i < 20; i++) {
                mercedes.xlr8();
            }
            System.out.println("Velocidade da Mercedes após acelerar muito: " + mercedes.velAtual + " km/h"); // Esperado: 320 (e não mais)

            System.out.println("\n--- FREANDO ---");
            // Freia o Civic
            civic.dxlr8();
            civic.dxlr8();
            System.out.println("Velocidade do Civic após frear: " + civic.velAtual + " km/h"); // Esperado: 5
        }
    }
