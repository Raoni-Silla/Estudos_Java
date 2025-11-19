package br.com.cod3r.exerciciosSB.model.entities.repositories;

import br.com.cod3r.exerciciosSB.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

//extrair a dificuldade de obter os dados, como vou abstrair o acesso a dadaos?
//uma interface de produto que extende do crud repositorios, <tipo de entidade que essa repo vai ficar responsavel por persisitr, tipo do id da classe>
public interface ProdutoRepository extends CrudRepository <Produto,Long> {



}
