package ExerciciosFixacao.ConferenciasTech;

public class Participante {
    String nome;
    String email;
    int idade;
    int idParticipante;
    static int proximoid; //atributo da classe


    //constructor
    Participante(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        proximoid++; // Incrementa o contador da CLASSE
        this.idParticipante = proximoid; // Atribui o novo valor
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Participante){

            Participante participante = (Participante) obj;

            boolean verificador;
            verificador =  this.email.equals(participante.email);

            return verificador;

        }return false;
    }
}
