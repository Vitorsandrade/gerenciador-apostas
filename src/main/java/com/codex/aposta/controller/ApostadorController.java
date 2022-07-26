package com.codex.aposta.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codex.aposta.model.dto.ApostadorIn;
import com.codex.aposta.service.ApostadorService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ApostadorController {

	private final ApostadorService apostadorService;

	@PostMapping("/apostador")
	public ResponseEntity salvarApostador(@RequestBody ApostadorIn apostadorIn) {
		apostadorService.salvaApostador(apostadorIn);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
