package com.ritchievales.pokedex.dao;

import com.ritchievales.pokedex.entity.Pokemon;

import java.util.List;

public interface PokemonDAO {

    List<Pokemon> findALl();

    Pokemon findByID(int id);

    Pokemon save(Pokemon pokemon);

    void deleteById(int id);

}
