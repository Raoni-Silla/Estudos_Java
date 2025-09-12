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
            System.out.println("---------------------------------");
            System.out.println("1.Criar evento");
            System.out.println("2.Inscrever participantes em evento");
            System.out.println("3.Listar participantes de um evento");
            System.out.println("4.Exibir vagas de um evento");

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
                    System.out.println("\n=======================================");
                    System.out.println("Eventos abertos a inscrição: ");
                    System.out.println(eventos.size()); // ele ta contabilizando os eventos na lista
                    for (int i = 0; i < eventos.size(); i++){
                        System.out.printf("Evento [%d] %s\n",i +1,eventos.get(i).nome );
                    }
                    System.out.println("================================================");
                    System.out.println("Selecione o evento que você quer se inscrever:");
                    int optSwit = cin.nextInt();
                    cin.nextLine();
                    optSwit -= 1;
                    System.out.println("insira os dados do participante abaixo: ");
                    System.out.println("nome: ");
                    String nomepart = cin.nextLine();
                    System.out.println("email: ");
                    String emailpart = cin.nextLine();
                    System.out.println("idade: ");
                    int idadepart = cin.nextInt();
                    Participante participante = new Participante(nomepart,emailpart,idadepart);
                    System.out.println("processando inscrição.......");
                    boolean ver = eventos.get(optSwit).inscreverParticipante(participante);
                    if (ver) {

                        System.out.printf("Parabéns, você %s foi inscrito com sucesso no evento \n", nomepart);
                    }
                    break;

                case "3":
                    System.out.println("--------Eventos------- ");
                    System.out.println(eventos.size()); // ele ta contabilizando os eventos na lista
                    for (int i = 0; i < eventos.size(); i++){
                        System.out.printf("Evento [%d] %s\n",i +1,eventos.get(i).nome );
                    }
                    System.out.println("================================================");
                    System.out.println("Selecione o evento que você deseja verificar os inscritos: ");
                    int optSwit3 = cin.nextInt();
                    cin.nextLine();
                    optSwit3 -= 1;
                    eventos.get(optSwit3).listarParticipantes();
                    break;
                case "4":
                    System.out.println("--------Eventos------- ");
                    System.out.println(eventos.size()); // ele ta contabilizando os eventos na lista
                    for (int i = 0; i < eventos.size(); i++){
                        System.out.printf("Evento [%d] %s\n",i +1,eventos.get(i).nome );
                    }
                    System.out.println("================================================");
                    System.out.println("Selecione o evento que você deseja verificar as vagas disponiveis: ");
                    int optSwit4 = cin.nextInt();
                    cin.nextLine();
                    optSwit4 -= 1;
                    int qntd = eventos.get(optSwit4).getVagasDisponiveis();
                    System.out.println("as vagas disponiveis pro evento "+ eventos.get(optSwit4).nome + " são de: " + qntd);

// ele ta dando null 2.
            }

        }


        cin.close();
    }
}
