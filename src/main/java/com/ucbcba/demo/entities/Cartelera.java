package com.ucbcba.demo.entities;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Cartelera {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToMany(mappedBy = "cartelera", cascade = CascadeType.ALL)
    private Set<Pelicula> peliculas;

    public Cartelera() {
        peliculas = new HashSet<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Set<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\": " + id +
                ", \"peliculas\": " + peliculas.toString() +
                "}";
    }
}
