package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.Pelicula;

public interface PeliculaService {

    Iterable<Pelicula> findAllPeliculas();
    Pelicula savePelicula(Pelicula pelicula);
    Pelicula findPeliculaById(Integer id);
    void deletePeliculaById(Integer id);
}
