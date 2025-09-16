package Classe.oo.composicao.exercicios;

import TreinoOrganizacaoPacotes.Pessoa.Aluno;

public class Pessoa {

    String nome;
    int idade;
    Cnh cnh;

    Pessoa (String nome, int idade, String nRegistro){

        this.cnh = new Cnh(nRegistro);
        this.nome = nome;
        this.idade = idade;

    }

    void ExibirDadosPessoa (){
        if (cnh.status != 1){
            System.out.println("Sua carteira de transito não esta ativa");
        }else {
            System.out.printf("Olá %s sua cnh é valida \n", nome);
            System.out.printf("O numero de registro dela: %s\n", cnh.nRegistro);
            System.out.printf("você é habilitado nas categoras: %s",cnh.cat);
        }
    }}
