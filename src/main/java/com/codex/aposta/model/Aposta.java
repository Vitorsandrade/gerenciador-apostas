package com.codex.aposta.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Aposta {

	@Id
	private String numeroAposta;
	
	@ManyToOne
	@JoinColumn(name = "id", nullable = false)
	private Apostador apostador;
	
}
