package com.codex.aposta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codex.aposta.model.Aposta;

public interface ApostaRepository extends JpaRepository<Aposta, String>{

}
