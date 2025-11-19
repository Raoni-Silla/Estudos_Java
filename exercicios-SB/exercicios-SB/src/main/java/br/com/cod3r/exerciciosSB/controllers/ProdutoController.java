package br.com.cod3r.exerciciosSB.controllers;

import br.com.cod3r.exerciciosSB.model.entities.Produto;
import br.com.cod3r.exerciciosSB.model.entities.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    //o spring fica responsavel por criar um objeto do tipo que ta ali
    @Autowired //ele coloca automaticamente um objeto dentro do nosso produtoRepositoru
    private ProdutoRepository produtoRepository;

    //em cima dessa url, qunado faço uma requisição do tipo post, faço a inserção
    @PostMapping //qnd for feita uma requisiçao pra essa url do tipo post, chama esse metodo
    public @ResponseBody Produto newProduct (@Valid Produto produtoparam) {//se eu uso todos os atributos de um objeto, não preciso passar os atributos como parametros, posso só dizer que ele vai receber um objeto e apartir disso o spring instancia esse objeto com as informações recebidads na requisição
        //o @ valid faz as validações escritas na classe produto pra que todas as regras sejam validadas
        produtoRepository.save(produtoparam);
        return produtoparam;
    }

    @GetMapping//retorna a lista de produtos
    public Iterable<Produto> getProdutos(){
       return produtoRepository.findAll(); //retorna um Iterable de produto, retorna todos os produtos do banco de dados
    }


}

//erro 400 é do cliente não do servidor
