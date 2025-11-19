package br.com.cod3r.exerciciosSB.controllers;

import br.com.cod3r.exerciciosSB.model.entities.Produto;
import br.com.cod3r.exerciciosSB.model.entities.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")

public class ProdutoController {
    //o spring fica responsavel por criar um objeto do tipo que ta ali
    @Autowired //ele coloca automaticamente um objeto dentro do nosso produtoRepositoru
    private ProdutoRepository produtoRepository;

    //CREATE
    //em cima dessa url, qunado faço uma requisição do tipo post, faço a inserção
    @PostMapping //qnd for feita uma requisiçao pra essa url do tipo post, chama esse metodo
    public @ResponseBody Produto newProduct (@Valid Produto produtoparam) {//se eu uso todos os atributos de um objeto, não preciso passar os atributos como parametros, posso só dizer que ele vai receber um objeto e apartir disso o spring instancia esse objeto com as informações recebidads na requisição
        //o @ valid faz as validações escritas na classe produto pra que todas as regras sejam validadas
        produtoRepository.save(produtoparam);
        return produtoparam;
    }

    //READ
    @GetMapping//retorna a lista de produtos
    public Iterable<Produto> getProdutos(){
       return produtoRepository.findAll(); //retorna um Iterable de produto, retorna todos os produtos do banco de dados
    }//não é o ideal fazer isso, pois pode travar o sistema
    //tabelas que podem ter um grande volume de dados, não é interessante ter essa opção

    //READ Id
    @GetMapping(path = "/{id}")
    public Produto getProduto(@PathVariable Long id){

       Optional <Produto> productFindId = produtoRepository.findById(id);

        if (productFindId.isPresent()){
            return productFindId.get();
        }else {
            throw new RuntimeException("Id não encontrado");
        }

    }

    @GetMapping(path = "/nome/{nome}")
    public Iterable<Produto> getProdutoByNome(@PathVariable String nome) {
        return produtoRepository.findByNomeContainingIgnoreCase(nome);
    }

    @PutMapping//dois metodos do http servem pra alterar
    public Produto updateProduct (@Valid Produto produtoparam) {
        produtoRepository.save(produtoparam);
        return produtoparam;
    }//parcial é o pat, inteiro é o put, o put é comumente mais usado para alterar tanto parcial quanto todos os atributos

    @DeleteMapping(path = "/{id}")
    public void deleteProduct (@PathVariable Long id){
        produtoRepository.deleteById(id);
    }




    }



//erro 400 é do cliente não do servidor
