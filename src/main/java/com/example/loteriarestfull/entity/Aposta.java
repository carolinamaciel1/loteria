package com.example.loteriarestfull.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties(value = {"apostador", "id"})
@Table(name = "aposta")
public class Aposta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @ManyToOne
    public Apostador apostador;

    @Column(name = "primeira_dezena")
    public int primeira_dezena;

    @Column(name = "segunda_dezena")
    public int segunda_dezena;

    @Column(name = "terceira_dezena")
    public int terceira_dezena;

    @Column(name = "quarta_dezena")
    public int quarta_dezena;

    @Column(name = "quinta_dezena")
    public int quinta_dezena;

    //Construtor
    public Aposta(long id, Apostador apostador, int primeira_dezena, int segunda_dezena, int terceira_dezena, int quarta_dezena, int quinta_dezena) {
        this.id = id;
        this.apostador = apostador;
        this.primeira_dezena = primeira_dezena;
        this.segunda_dezena = segunda_dezena;
        this.terceira_dezena = terceira_dezena;
        this.quarta_dezena = quarta_dezena;
        this.quinta_dezena = quinta_dezena;
    }

    public Aposta() {

    }
}
