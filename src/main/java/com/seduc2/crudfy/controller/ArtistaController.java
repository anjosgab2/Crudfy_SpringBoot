package com.seduc2.crudfy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistaController {

    @GetMapping("artista")
    public String mostrarArtista(){
        return "Achou o artista 'Marília Mendonça";
    }
}
