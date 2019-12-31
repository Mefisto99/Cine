package com.ucbcba.demo.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String titulo;
    @ManyToOne(optional = false)
    @JoinColumn(name = "cartelera_id")
    private Cartelera cartelera;
    @OneToMany(mappedBy = "pelicula", cascade = CascadeType.ALL)
    private Set<Funcion> funcion;

    public Pelicula() { funcion = new HashSet<>(); }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Cartelera getCartelera() {
        return cartelera;
    }

    public void setCartelera(Cartelera cartelera) {  this.cartelera = cartelera;  }

    public Set<Funcion> getFuncion() { return funcion; }

    public void setFuncion(Set<Funcion> funcion) {
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\": " + id +
                ", \"titulo\": \"" + titulo + '\"' +
                ", \"cartelera_id\": " + cartelera.getId() +
                ", \"funcion\": " + funcion.toString() +
                "}";
    }
}
