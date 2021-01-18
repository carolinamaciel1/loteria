package com.example.loteriarestfull.controller;

import com.example.loteriarestfull.entity.Aposta;
import com.example.loteriarestfull.entity.Apostador;
import com.example.loteriarestfull.repository.ApostadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/minhas_apostas/")
public class ApostadorController {
    @Autowired
    private ApostadorRepository apostadorRepository;

    @GetMapping("/{email}")
    public List<Aposta> getMinhasApostas(@PathVariable(value="email") String email){
        Optional<Apostador> apostadorOptional = apostadorRepository.findByEmail(email);
        return apostadorOptional.isEmpty() ? null : apostadorOptional.get().getApostas();
    }

}

