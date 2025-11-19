package br.com.cod3r.exerciciosSB.model.entities.repositories;

import br.com.cod3r.exerciciosSB.model.entities.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

//extrair a dificuldade de obter os dados, como vou abstrair o acesso a dadaos?
//uma interface de produto que extende do crud repositorios, <tipo de entidade que essa repo vai ficar responsavel por persisitr, tipo do id da classe>
public interface ProdutoRepository extends CrudRepository <Produto,Long> {

    //estudar convenções do spring boot para fazer consultas
 public Iterable<Produto> findByNomeContainingIgnoreCase(String nome);

    //findByNomeStartsWith
    // findByNomeEndsWith

    @Query("SELECT p From Produto p where p.nome LIKE %:nome% ")
    public Iterable<Produto> searchByNameLikeIgnoreCase(@Param("nome") String nome);
}
