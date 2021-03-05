package br.com.cwi.reset.exemploreset;

import org.springframework.web.bind.annotation.*;

@RestController
public class NomeController {

    private static String nome = "Teste";

    @GetMapping("/nome")
    public String showNome(){
        return nome;
    }

    @PutMapping("/nome/{novoNome}")
    public String mudarNome(@PathVariable String novoNome){
        this.nome = novoNome;
        return this.nome;
    }

    @DeleteMapping
    public void deleteNome(){
        this.nome = null;
    }
}
