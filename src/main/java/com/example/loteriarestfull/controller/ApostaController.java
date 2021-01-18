package com.example.loteriarestfull.controller;

import com.example.loteriarestfull.entity.Aposta;
import com.example.loteriarestfull.entity.Apostador;
import com.example.loteriarestfull.repository.ApostaRepository;
import com.example.loteriarestfull.repository.ApostadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.Random;

@RestController
@RequestMapping("/gerar_aposta/")
public class ApostaController {

    @Autowired
    private ApostaRepository apostaRepository;

    @Autowired
    private ApostadorRepository apostadorRepository;

    @PostMapping
    public Aposta gerarAposta(@RequestBody Apostador apostador) {

        int VALOR_LIMITE = 60;
        Apostador novo_apostador;

        Optional<Apostador> apostadorOptional = apostadorRepository.findByEmail(apostador.getEmail());
        if (apostadorOptional.isEmpty()) {
            novo_apostador = apostadorRepository.save(apostador);
        } else {
            novo_apostador = apostadorOptional.get();
        }

        Random gerador = new Random();
        Aposta nova_aposta = new Aposta();
        nova_aposta.primeira_dezena = gerador.nextInt(VALOR_LIMITE) + 1;
        nova_aposta.segunda_dezena = gerador.nextInt(VALOR_LIMITE) + 1;
        nova_aposta.terceira_dezena = gerador.nextInt(VALOR_LIMITE) + 1;
        nova_aposta.quarta_dezena = gerador.nextInt(VALOR_LIMITE) + 1;
        nova_aposta.quinta_dezena = gerador.nextInt(VALOR_LIMITE) + 1;

        nova_aposta.apostador = novo_apostador;

        return this.apostaRepository.save(nova_aposta);

    }

}
