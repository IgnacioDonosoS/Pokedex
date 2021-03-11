package com.Tienda.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Tienda.modelo.Pokedex;

public interface PokedexRepo extends JpaRepository<Pokedex, Integer> {
}
