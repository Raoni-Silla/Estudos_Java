package ExerciciosFixacao.ConferenciasTech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorEventos {
    // crio uma lista de eventos, do tipo Evento
    static List <Evento> eventos = new ArrayList<>();

    public static void main(String[] args) {



        Scanner cin = new Scanner(System.in);
        String opcao = " ";




        while (!opcao.trim().equalsIgnoreCase("sair")){


            System.out.println("=================================");
            System.out.println("menu inicial");
            System.out.println("-------------------------------");
            System.out.println("1.Criar evento");
            System.out.println("2.Inscrever participantes em evento");

            opcao = cin.nextLine();

            switch (opcao){
                case "1":
                    System.out.println("-------------------------------");
                    System.out.println("Cadastrar novo evento: ");
                    System.out.println("-------------------------------");
                    System.out.println("Digite o nome do evento: ");
                    String nome = cin.nextLine();
                    System.out.println("Digite o nome do local: ");
                    String local = cin.nextLine();
                    System.out.println("Digite a capacidade total: ");
                    int capMax = cin.nextInt();
                    cin.nextLine();
                    eventos.add(new Evento(nome,local,capMax));
                    System.out.println("evento cadastrado com sucesso !!!");
                    System.out.println("=====================================");
                    break;
                case "2":
                    System.out.println("=======================================");
                    System.out.println("Eventos abertos a inscrição: ");
                    System.out.println(eventos.size()); // ele ta contabilizando os eventos na lista
                    for (int i = 0; i < eventos.size(); i++){
                        System.out.printf("Evento [%d] %s",i +1,eventos.get(i).nome);
                    }

// ele ta dando null 2.
            }

        }


        cin.close();
    }
}
