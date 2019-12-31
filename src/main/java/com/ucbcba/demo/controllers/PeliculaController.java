package com.ucbcba.demo.controllers;

import com.ucbcba.demo.entities.Pelicula;
import com.ucbcba.demo.services.CarteleraService;
import com.ucbcba.demo.services.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PeliculaController {

    private PeliculaService peliculaService;
    private CarteleraService carteleraService;

    @Autowired
    public void setCarteleraService(CarteleraService carteleraService) {
        this.carteleraService = carteleraService;
    }

    @Autowired
    public void setPeliculaService(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }


    @PostMapping("/pelicula/save")
    public ResponseEntity<Pelicula> savePelicula(@RequestBody Pelicula movie) {
        return new ResponseEntity<>(peliculaService.savePelicula(movie), HttpStatus.OK);
    }

    @GetMapping("/pelicula/get")
    public ResponseEntity<String> findPeliculaById(@RequestParam("id") Integer id) {
        return new ResponseEntity<>(peliculaService.findPeliculaById(id).toString(), HttpStatus.OK);
    }
    @GetMapping("/pelicula/comments")
    public ResponseEntity<Iterable<Pelicula>> findAll() {
        return  new ResponseEntity<>(peliculaService.findAllPeliculas(), HttpStatus.OK);
    }
    @GetMapping("/pelicula/list")
    public ResponseEntity<String> findAllPeliculas() {
        return new ResponseEntity<>(peliculaService.findAllPeliculas().toString(), HttpStatus.OK);
    }
}
