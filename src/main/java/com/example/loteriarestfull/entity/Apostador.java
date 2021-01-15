package com.example.loteriarestfull.entity;

public class Apostador {
    private long id;

    public Apostador(String email, int[] aposta) {
        this.email = email;
        this.aposta = aposta;
    }

    private String email;
    private int[] aposta = new int [6];


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int[] getAposta() {
        return aposta;
    }

    public void setAposta(int[] aposta) {
        this.aposta = aposta;
    }
}
