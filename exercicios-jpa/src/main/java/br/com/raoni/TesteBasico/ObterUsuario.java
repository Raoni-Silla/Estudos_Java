package br.com.raoni.TesteBasico;

import br.com.raoni.ModeloBasico.Usuarios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObterUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        //exige transação envolvendo persist, caso seja um insert

        //o find faz uma busca unitaria no banco de dados
        //eu passo qual tipo de classe eu quero mapear apartir do resultado do bd
        //e depois o segundo parametro é o identificador que eu vou usar pra achar
        //no banco de dados o determinado usuario

        Usuarios usuario = em.find(Usuarios.class, 3L);
        System.out.println(usuario);



        em.close();
        emf.close();
    }
}
