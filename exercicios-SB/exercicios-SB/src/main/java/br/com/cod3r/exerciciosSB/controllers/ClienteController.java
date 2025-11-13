package br.com.cod3r.exerciciosSB.controllers;

import br.com.cod3r.exerciciosSB.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente ObterCliente(){
        return new Cliente("jonh marston", "marston@gmail.com","18 99698-5449","43994642389");
    }

}
