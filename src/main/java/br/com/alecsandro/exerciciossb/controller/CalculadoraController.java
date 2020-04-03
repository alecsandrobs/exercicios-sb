package br.com.alecsandro.exerciciossb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("calculadora")
public class CalculadoraController {

    // /calculadora/somar/10/20
    @GetMapping(path = "/somar/{n1}/{n2}")
    public String somar(@PathVariable double n1, @PathVariable double n2) {
        return String.format("%.2f + %.2f = %.2f", n1, n2, (n1 + n2));
    }


    // /calculadora/subtrair?n1=100&n2=39
    @GetMapping(path = "/subtrair")
    public String subtrair(@RequestParam(name = "n1") double n1, @RequestParam(name = "n2") double n2) {
        return String.format("%.2f - %.2f = %.2f", n1, n2, (n1 - n2));
    }
}
