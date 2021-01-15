//package com.example.loteriarestfull.entity;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "apostador")
//public class Apostador {
//
//    public Apostador(String email, Aposta aposta_id) {
//        this.email = email;
//        this.aposta_id = aposta_id;
//    }
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//
//    @Column(name = "email")
//    private String email;
//
//    @Column(name="aposta")
//    private Aposta aposta_id;
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Aposta getAposta_id() {
//        return aposta_id;
//    }
//
//    public void setAposta_id(Aposta aposta_id) {
//        this.aposta_id = aposta_id;
//    }
//}
