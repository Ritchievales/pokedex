package com.ritchievales.pokedex.service;

import com.ritchievales.pokedex.dao.PokemonDAO;
import com.ritchievales.pokedex.entity.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PokemonServiceImpl implements PokemonService{

    private final PokemonDAO pokemonDAO;

    @Autowired
    public PokemonServiceImpl(PokemonDAO pokemonDAO){
        this.pokemonDAO = pokemonDAO;
    }

    @Override
    public List<Pokemon> findALl() {
        return pokemonDAO.findALl();
    }

    @Override
    public Pokemon findByID(int id) {
        return pokemonDAO.findByID(id);
    }

    @Transactional
    @Override
    public Pokemon save(Pokemon pokemon) {
        return pokemonDAO.save(pokemon);
    }

    @Override
    public void deleteById(int id) {
        pokemonDAO.deleteById(id);
    }
}
