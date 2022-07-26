package com.codex.aposta;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApostadorController {
	
	
	private final ApostadorRepository apostadorRepository;
	
	public ApostadorController(ApostadorRepository apostadorRepository) {
		this.apostadorRepository = apostadorRepository;
	}

	@PostMapping("/apostador")
	public ResponseEntity salvarApostador(@RequestBody ApostadorIn apostadorIn ) {
		Apostador apostador = apostadorIn.toConvert();
		apostadorRepository.save(apostador);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
