package br.com.cod3r.exerciciosSB.controllers;

import br.com.cod3r.exerciciosSB.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente ObterCliente(){
        return null;
    }

    @GetMapping("/{id}/{id2}")
    public Cliente ObterClientePorID(@PathVariable int id){
        return new Cliente(id, "Maria", "Maria@gmail.com","18996985449","4394841639");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name="id", defaultValue = "1") int id){
        return new Cliente(id,"carlos","carlos@gmail.com","18996985449","4394841639");
    }

}
