package com.Tienda.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pokedex {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPokedex;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
	name = "Pokedex_tiene_pokemon",
	joinColumns = @JoinColumn(name = "idPokedex"),
	inverseJoinColumns =  @JoinColumn(name = "idPokemon"))
	private List<Pokemon> pokemon;
	
}
