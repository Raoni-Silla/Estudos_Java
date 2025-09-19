package Desafios.Classe.SistemadeGestaodeCatalogodeCursos;

import java.util.ArrayList;
import java.util.Scanner;

public class PlataformaCursosApp {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList <Instrutor> instrutores = new ArrayList<>();
        ArrayList <Curso> cursosList = new ArrayList<>();

        int opt;
        int sair = 1;

        while (sair != 0) {

            System.out.println("=============MENU=============");
            System.out.println("****Escolha uma opção abaixo****");
            System.out.println("1.Cadastrar novo Instrutor.");
            System.out.println("2.Criar novo Curso (pedir o título e associar a um instrutor já cadastrado).");
            System.out.println("3.Adicionar Aulas a um Curso.");
            System.out.println("4.Cadastrar novo Aluno.");
            System.out.println("5.Matricular Aluno em Curso");
            System.out.println("6.Listar Cursos de um Instrutor.");
            System.out.println("7.Listar Alunos de um Curso.");

            opt = cin.nextInt();
            cin.nextLine();

            switch (opt) {
                case 1:
                    System.out.println("||||||||||||||||||||||||||||||||||||");
                    System.out.println("Digite o nome do instrutor:");
                    String nomeInst = cin.nextLine();
                    Instrutor instrutornew = new Instrutor(nomeInst);
                    instrutores.add(instrutornew);
                    System.out.println("Instrutor cadastrado com sucesso!!");
                     break;
                case 2:
                    System.out.println("|/||||||||||||||||||||||||||||||||||");
                    System.out.println("Digite o nome do curso: ");
                    String nomeCurs1 = cin.nextLine();
                    System.out.println("Professores cadastrados: ");
                    int i = 0;
                    for (Instrutor ints : instrutores){
                        System.out.println(i + 1 + " " + ints.nome);
                        i++;
                    }
                    System.out.println("Digite o nome do professor desejado: ");
                    String nomeProf = cin.nextLine();
                    for (Instrutor ints : instrutores){

                        if (ints.nome.equalsIgnoreCase(nomeProf)){

                            Curso curso = new Curso(nomeCurs1,ints);
                            System.out.println("Curso "+ nomeCurs1 + " cadstrado com sucesso");
                            System.out.println("Sera monitorado por: " + nomeProf  );
                            cursosList.add(curso);

                        }else {System.out.println("nome de professor não encontrado");}

                    }
                    break;
                case 3:
                    System.out.println("Digite o nome da aula: ");
                    String nomeAul = cin.nextLine();
                    System.out.println("Digite a duração da aula: ");
                    int durAul = cin.nextInt();
                    cin.nextLine();
                    Aula aula = new Aula(nomeAul,durAul);
                    System.out.println("Cursos disponiveis: ");
                    int id = 0;

                    for (Curso curs : cursosList){
                        System.out.println((id + 1) + " " + curs.titulo);
                        id++;

                    }
                    System.out.println("digite o nome do curso desejado para adicionar a aula: ");
                    String nomeCurs = cin.nextLine();

                    for (Curso curs : cursosList){
                        if (curs.titulo.equalsIgnoreCase(nomeCurs)){

                            curs.adicionarAulas(aula);
                            System.out.println("Aula cadastrada com sucesso!!");
                            System.out.println("Aula " + aula.titulo + " cadastrada com sucesso no curso " + curs.titulo);

                        } else {
                            System.out.println("ERROR: digite um nome dentro da lista de cursos acima!!");
                            System.out.println("Curso não encontrado");
                        }

                    }break;




                default:
                    System.out.println("error");
                    break;


            }

            System.out.println("Deseja sair? (1-nao / 0-sim)");
            sair = cin.nextInt();
        }
        cin.close();
    }

}
