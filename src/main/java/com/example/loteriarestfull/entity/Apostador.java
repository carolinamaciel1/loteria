package com.example.loteriarestfull.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties(value = {"apostas"})
@Table(name = "apostador")
public class Apostador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "email")
    private String email;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "apostador")
    private List<Aposta> apostas;

    //Construtor
    public Apostador(long id, String email, List<Aposta> apostas) {
        this.id = id;
        this.email = email;
        this.apostas = apostas;
    }

    public Apostador() {

    }

    //Getters and Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonIgnore
    public List<Aposta> getApostas() {
        return apostas;
    }

    public void setApostas(List<Aposta> apostas) {
        this.apostas = apostas;
    }
}


