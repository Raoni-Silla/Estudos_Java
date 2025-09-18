package Desafios.Classe.SistemadeGestaodeCatalogodeCursos;

import java.util.ArrayList;
import java.util.Scanner;

public class PlataformaCursosApp {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList <Instrutor> instrutores = new ArrayList<>();

        int opt = 0;
        int sair = 1;
        Instrutor instrutor1 = new Instrutor("eduardo");

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
                    System.out.println("||||||||||||||||||||||||||||||||||||");
                    System.out.println("Digite o nome do curso: ");
                    String nomeCurs = cin.nextLine();
                    System.out.println("Professores cadastrados: ");
                    int i = 0;
                    for (Instrutor ints : instrutores){
                        System.out.println(i + 1 + " " + ints.nome);
                        i++;
                    }
                    System.out.println("Digite o nome do professor desejado: ");
                    String nomeProf = cin.nextLine();
                    for (Instrutor ints : instrutores){

                        if (ints.nome.equalsIgnoreCase(nomeProf.toString())){

                            Curso curso = new Curso(nomeCurs,ints);
                            System.out.println("Curso "+ nomeCurs + " cadstrado com sucesso");
                            System.out.println("Sera monitorado por: " + nomeProf  );
                            break;
                        }else System.out.println("nome de professor não encontrado");

                    }


                    break;


                default:
                    System.out.println("error");
                    break;


            }


        }
        cin.close();
    }

}
