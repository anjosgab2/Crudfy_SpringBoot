package com.seduc2.crudfy.Service;

import com.seduc2.crudfy.entity.Artista;
import com.seduc2.crudfy.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistaService {

    @Autowired
    ArtistaRepository artistaRepository;

    public List<Artista> mostrarArtista(){
        List<Artista> artistaList = new ArrayList<>();
        artistaList = artistaRepository.findAll();
        return artistaList;
    }
}
