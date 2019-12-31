package com.ucbcba.demo.repositories;

import com.ucbcba.demo.entities.Pelicula;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface PeliculaRepository extends CrudRepository<Pelicula, Integer> {
}
