package com.example.helloworld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oFurabio")
public class ApplicationController {
    @GetMapping("/hello-world")
    public String HelloWorld(){
        return "Hello World!";
    }

    @GetMapping("/bsm")
    public String BsmGeneration(){
        return "Lista de BSMs:\nPersistência\n" +
                "Mentalidade de Crescimento\n" +
                "Orientação ao Futuro\n" +
                "Responsabilidade Pessoal\n" +
                "Trabalho em Equipe\n" +
                "Comunicação\n" +
                "Orientação aos Detalhes\n" +
                "Proatividade";
    }

    @GetMapping("/objetivos")
    public String ObjetivosPessoais(){
        return "Meus objetivos pessoais essa semana são:\n" +
                "   - Melhorar minha responsabilidade pessoal;\n" +
                "   - Melhorar meu trabalho em equipe;\n" +
                "   - Aprender a usar o Spring.";
    }
}
