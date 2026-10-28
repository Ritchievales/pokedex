package com.ritchievales.pokedex.service;

import com.ritchievales.pokedex.entity.Pokemon;

import java.util.List;

public interface PokemonService {

    List<Pokemon> findALl();

    Pokemon findByID(int id);

    Pokemon save(Pokemon pokemon);

    void deleteById(int id);

}
