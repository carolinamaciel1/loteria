package com.example.loteriarestfull.controller;

import com.example.loteriarestfull.entity.Aposta;
import com.example.loteriarestfull.repository.ApostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

//Nesse endpoint "Aposta" passamos para o endpoint um email e nos é retornado um conjunto de números de 6 dezenas como aposta.

@RestController
@RequestMapping("/gerar_aposta/")
public class ApostaController {

    @Autowired
    private ApostaRepository apostaRepository;

    @PostMapping
    public Aposta criarAposta(@RequestBody Aposta aposta){
        aposta.pimeira_dezena = 1;
        aposta.segunda_dezena = 2;
        aposta.terceira_dezena = 3;
        aposta.quarta_dezena = 4;
        aposta.quinta_dezena = 5;
        return this.apostaRepository.save(aposta);

    }

}
