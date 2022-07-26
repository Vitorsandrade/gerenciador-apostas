package com.codex.aposta.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codex.aposta.model.dto.ApostaIn;
import com.codex.aposta.model.dto.ApostaOut;
import com.codex.aposta.service.ApostaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ApostaController {

	private final ApostaService apostaService;
	
	@PostMapping("/aposta")
	public ApostaOut salvaAposta(@RequestBody ApostaIn apostaIn) {

		return apostaService.salvaAposta(apostaIn);
	}

}
