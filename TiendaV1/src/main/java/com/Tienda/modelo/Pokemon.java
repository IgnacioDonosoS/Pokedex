package com.Tienda.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPokemon;
	private String nombrePokemon;
	private String tipoPokemon;
	private float altura;
	private int peso;
	private String frase;
	private String imagen;
	private String miniaturas;
}
