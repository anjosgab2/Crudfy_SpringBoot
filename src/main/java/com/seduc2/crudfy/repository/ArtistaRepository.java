package com.seduc2.crudfy.repository;

import com.seduc2.crudfy.entity.Artista;
import com.seduc2.crudfy.entity.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista, Integer> {

}
