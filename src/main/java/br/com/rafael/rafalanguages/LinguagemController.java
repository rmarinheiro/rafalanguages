package br.com.rafael.rafalanguages;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

    @Autowired
    private LinguagemRepository repositorio;

   
    
    @GetMapping(value = "/linguagens")
    public List<Linguagem> getLinguagens(){
        return repositorio.findAll();
    }

    @PostMapping(value = "/linguagens")
    public Linguagem  inserirLinguagem(@RequestBody Linguagem linguagem){
        Linguagem linguagemSalva = repositorio.save(linguagem);
        return linguagemSalva;
    }

}
