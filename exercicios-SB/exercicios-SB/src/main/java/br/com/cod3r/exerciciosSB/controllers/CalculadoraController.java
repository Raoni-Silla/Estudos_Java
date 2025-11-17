package br.com.cod3r.exerciciosSB.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {

    @GetMapping(path = "/somar/{n1}/{n2}")
    public long somar(@PathVariable long n1, @PathVariable long n2){
        return n1 + n2;
    }

    @GetMapping(path = "/subtrair")
    public long subtrair(@RequestParam (name = "n1", defaultValue = "0") long n1, @RequestParam(name = "n2", defaultValue = "0") long n2){
        return n1 - n2;
    }


}
