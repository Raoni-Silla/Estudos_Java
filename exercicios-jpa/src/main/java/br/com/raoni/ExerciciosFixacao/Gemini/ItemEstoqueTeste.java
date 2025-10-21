package br.com.raoni.ExerciciosFixacao.Gemini;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.Arrays;
import java.util.List;

public class ItemEstoqueTeste {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        List <ItemEstoque> itens = Arrays.asList(
                new ItemEstoque("Teclado", 11.90, 20),
                new ItemEstoque("Mouse", 20.20,2),
                new ItemEstoque("monitor", 2000.20,3)
        );

        //[CRIAR] Crie e salve (persista) um novo item
        em.getTransaction().begin();
        em.persist(itens.get(0));
        em.persist(itens.get(1));
        em.persist(itens.get(2));
        em.getTransaction().commit();

        //[LER 1] Busque  e [ATUALIZAR]
        em.getTransaction().begin();
        ItemEstoque item = em.find(ItemEstoque.class, 1L);
        System.out.println("ItemEstoque: " + item.getNome() + " - " + item.getPreco());
        item.setPreco(item.getPreco() - 5.0);
        System.out.println("ItemEstoque: " + item.getNome() + " - " + item.getPreco());
        em.getTransaction().commit();

        //[LER 2] Busque  e [DELETE]
        String jpl = "select item from ItemEstoque item";
        TypedQuery <ItemEstoque> query = em.createQuery(jpl, ItemEstoque.class);
        List <ItemEstoque> queryResult = query.getResultList();
        for (ItemEstoque item1 : queryResult) {
            System.out.println("ItemEstoque: " + item1.getNome() + " - " + item1.getPreco());
        }
        em.getTransaction().begin();
        ItemEstoque itemDelete = em.find(ItemEstoque.class, 2L);
        System.out.println("ItemEstoque: " + itemDelete.getNome() + " - " + itemDelete.getPreco());
        em.remove(itemDelete);
        System.out.println("Item excluido");
        em.getTransaction().commit();





        em.close();
        emf.close();

    }
}
