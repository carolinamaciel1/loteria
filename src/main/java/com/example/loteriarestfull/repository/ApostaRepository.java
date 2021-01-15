package com.example.loteriarestfull.repository;

import com.example.loteriarestfull.entity.Aposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApostaRepository extends JpaRepository<Aposta, Long> {

}
