package com.Tienda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tienda.modelo.Pokedex;

public interface PokedexRepo extends JpaRepository<Pokedex, Integer> {

}
