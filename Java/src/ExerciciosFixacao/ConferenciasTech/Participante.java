package ExerciciosFixacao.ConferenciasTech;

public class Participante {
    String nome;
    String email;
    int idade;
    int idParticipante;
    static int proximoid; //atributo da classe


    //constructor
    Participante(String nome, String email, int idade){
        //referencio que as variaves this pertecem ao atributo e nao sao parametros
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.idParticipante = proximoid + 1;

    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Participante){

            Participante participante = (Participante) obj;

            boolean verificador;
            verificador =  this.email.equals(participante.email);

            return verificador;


        }return false;


        // nao aprendi como fazer hashcode pratica

    }
}
