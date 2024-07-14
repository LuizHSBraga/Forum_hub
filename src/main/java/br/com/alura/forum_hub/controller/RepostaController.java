package br.com.alura.forum_hub.controller;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/respostas")
@SecurityRequirement(name = "bearer-key")
public class RepostaController {
    @Autowired
    private RespostaService service;
}
