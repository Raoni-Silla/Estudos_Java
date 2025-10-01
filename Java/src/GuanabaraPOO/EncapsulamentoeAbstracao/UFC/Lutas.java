package GuanabaraPOO.EncapsulamentoeAbstracao.UFC;

import java.util.Random;

public class Lutas {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public void marcarLuta(Lutador l1,Lutador l2){


        if (l1.getCategorias().equalsIgnoreCase(l2.getCategorias()) && l1 != l2){

            this.setAprovado(true);
            this.desafiado = l1;
            this.desafiante = l2;
            System.out.println("Luta marcada");

        }else {
            this.setAprovado(false);
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Luta não marcada");
        }





    }

    public void lutar(){

        if (isAprovado()){
            Random gerador = new Random();
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            int vencedor = gerador.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.println("Empate");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("vitoria do desafiado");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("vitoria do desafiante");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        }else System.out.println("luta nao pode acontecer");



    }


    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
