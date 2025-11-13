package br.com.cod3r.exerciciosSB.controllers;


import org.springframework.web.bind.annotation.*;

@RestController("/first")
public class FirstController {

    //mapear uma requisição pra esse metodo
    //@RequestMapping(method = RequestMethod.GET, path = "/ola") da pra configurar o tipo do metodo http

    @GetMapping(path = {"/ola", "/saudacao"})
    public String helloWorld (){
            return "Hello World";
    }


}
