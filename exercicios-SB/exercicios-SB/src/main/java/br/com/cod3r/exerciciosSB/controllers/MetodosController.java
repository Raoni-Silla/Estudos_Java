package br.com.cod3r.exerciciosSB.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosController {

    @GetMapping
    public String get(){
        return "requisição GET";
    }

    @PostMapping
    public String post(){
        return "requisição post";
    }

    @PutMapping
    public String put(){
        return "requisição put";
    }

    @PatchMapping
    public String patch(){
        return "requisição patch";
    }

    @DeleteMapping
    public String delete(){
        return "requisição delete";
    }
}
