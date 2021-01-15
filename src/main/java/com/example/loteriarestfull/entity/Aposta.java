package com.example.loteriarestfull.entity;

import javax.persistence.*;

@Entity
@Table(name = "aposta")
public class Aposta {

    public Aposta(String email, int pimeira_dezena, int segunda_dezena, int terceira_dezena,
                  int quarta_dezena, int quinta_dezena) {
        this.email = email;
        this.pimeira_dezena = pimeira_dezena;
        this.segunda_dezena = segunda_dezena;
        this.terceira_dezena = terceira_dezena;
        this.quarta_dezena = quarta_dezena;
        this.quinta_dezena = quinta_dezena;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @Column(name = "apostador")
    public String email;

    @Column(name = "pimeira_dezena")
    public int pimeira_dezena;

    @Column(name = "segunda_dezena")
    public int segunda_dezena;

    @Column(name = "terceira_dezena")
    public int terceira_dezena;

    @Column(name = "quarta_dezena")
    public int quarta_dezena;

    @Column(name = "quinta_dezena")
    public int quinta_dezena;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = email;
    }

    public int getPimeira_dezena() {
        return pimeira_dezena;
    }

    public void setPimeira_dezena(int pimeira_dezena) {
        this.pimeira_dezena = pimeira_dezena;
    }

    public int getSegunda_dezena() {
        return segunda_dezena;
    }

    public void setSegunda_dezena(int segunda_dezena) {
        this.segunda_dezena = segunda_dezena;
    }

    public int getTerceira_dezena() {
        return terceira_dezena;
    }

    public void setTerceira_dezena(int terceira_dezena) {
        this.terceira_dezena = terceira_dezena;
    }

    public int getQuarta_dezena() {
        return quarta_dezena;
    }

    public void setQuarta_dezena(int quarta_dezena) {
        this.quarta_dezena = quarta_dezena;
    }

    public int getQuinta_dezena() {
        return quinta_dezena;
    }

    public void setQuinta_dezena(int quinta_dezena) {
        this.quinta_dezena = quinta_dezena;
    }


}
