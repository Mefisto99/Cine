package com.ucbcba.demo.entities;

import javax.persistence.*;

@Entity
public class Funcion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String sala;
    @OneToOne(optional = false)
    @JoinColumn(name = "pelicula_id")
    private Pelicula pelicula;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getSala() {
        return sala;
    }

    public Pelicula getPelicula() { return pelicula; }

    public void setPelicula(Pelicula pelicula) {  this.pelicula = pelicula;  }

    @Override
    public String toString() {
        return "{" +
                "\"id\": " + id +
                ", \"sala\": \"" + sala + '\"' +
                ", \"pelicula_id\": " + pelicula.getId() +
                "}";
    }
}
