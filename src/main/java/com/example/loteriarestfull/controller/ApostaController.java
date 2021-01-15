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
    public Aposta criarAposta(@RequestBody Aposta aposta) {

        //TODO: resolver o problema de números duplicados nas dezenas
        //TODO: resolver o problema de e-mails duplicados em Apostador
        //com o nextInt é possível que as dezenas fiquem duplicadas, como resolver este problema?


        int VALOR_LIMITE = 60;

        Random gerador = new Random();

        aposta.pimeira_dezena = gerador.nextInt(VALOR_LIMITE);
        aposta.segunda_dezena = gerador.nextInt(VALOR_LIMITE);
        aposta.terceira_dezena = gerador.nextInt(VALOR_LIMITE);
        aposta.quarta_dezena = gerador.nextInt(VALOR_LIMITE);
        aposta.quinta_dezena = gerador.nextInt(VALOR_LIMITE);
        return this.apostaRepository.save(aposta);

    }

}
