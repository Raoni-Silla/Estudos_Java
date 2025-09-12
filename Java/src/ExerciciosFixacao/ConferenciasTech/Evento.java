package ExerciciosFixacao.ConferenciasTech;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Evento {
    String nome;
    String local;
    int capacidadeMax;
    Set <Participante> participantesInscritos;



    Evento (String nome, String local, int capacidadeMax){
        this.capacidadeMax = capacidadeMax;
        this.local = local;
        this.nome = nome;
        this.participantesInscritos = new HashSet<>(); // inicializo o set de participanetes
    }

   boolean inscreverParticipante(Participante p){
        if (this.capacidadeMax > participantesInscritos.size()){

             participantesInscritos.add(p);

            System.out.println("participante inscrito com sucesso");

            return true;


        }else {
            System.out.println("ERROR:");
            System.out.println("participante não inscrito");
            System.out.println("Evento lotado");
            return false;
        }

   }

   int getVagasDisponiveis(){
        return this.capacidadeMax - participantesInscritos.size();
   }

   void listarParticipantes(){

        System.out.println("os participantes inscritos são: ");
        for (Participante p: participantesInscritos){
            System.out.printf(" nome: %s | idade: %d | email: %s \n",p.nome,p.idade,p.email);
        }
   }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return capacidadeMax == evento.capacidadeMax && Objects.equals(nome, evento.nome) && Objects.equals(local, evento.local) && Objects.equals(participantesInscritos, evento.participantesInscritos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, local, capacidadeMax, participantesInscritos);
    }
}
