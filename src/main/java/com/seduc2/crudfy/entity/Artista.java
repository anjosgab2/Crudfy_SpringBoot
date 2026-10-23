package com.seduc2.crudfy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Artista {

@Id
private int id_artista;
private String nome;
private String estilo;

public int getId_artista() {
    return id_artista;
}
}
