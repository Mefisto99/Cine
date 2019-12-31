package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.Pelicula;
import com.ucbcba.demo.repositories.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PeliculaServiceImpl implements PeliculaService {

    private PeliculaRepository peliculaRepository;

    @Autowired
    @Qualifier("peliculaRepository")
    public void setPeliculaRepository(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }

    @Override
    public Iterable<Pelicula> findAllPeliculas() {
        return peliculaRepository.findAll();
    }

    @Override
    public Pelicula savePelicula(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    @Override
    public Pelicula findPeliculaById(Integer id) {
        return peliculaRepository.findById(id).get();
    }

    @Override
    public void deletePeliculaById(Integer id) {
        peliculaRepository.deleteById(id);
    }
}
