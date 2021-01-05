package com.Tienda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tienda.modelo.Pokemon;

public interface PokemonRepo extends JpaRepository<Pokemon, Integer> {

}
