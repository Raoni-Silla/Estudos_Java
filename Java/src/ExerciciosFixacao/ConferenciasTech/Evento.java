package ExerciciosFixacao.ConferenciasTech;

import java.util.Set;

public class Evento {
    String nome;
    String local;
    int capacidadeMax;
    Set <Participante> participantesInscritos;



    Evento (String nome, String local, int capacidadeMax){
        this.capacidadeMax = capacidadeMax;
        this.local = local;
    }

   boolean inscreverParticipante(Participante p){
        if (this.capacidadeMax > participantesInscritos.size()){

             participantesInscritos.add(p);

            System.out.println("participante inscrito com sucesso");
            System.out.println(participantesInscritos);
            return true;


        }else {
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
            System.out.println(p);
        }
   }
}
