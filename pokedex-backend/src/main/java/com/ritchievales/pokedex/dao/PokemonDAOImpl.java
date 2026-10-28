package com.ritchievales.pokedex.dao;


import com.ritchievales.pokedex.entity.Pokemon;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PokemonDAOImpl implements PokemonDAO {

    //define entityManager
    private final EntityManager entityManager;

    // constructor injection
    @Autowired
    public PokemonDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Pokemon> findALl() {

        TypedQuery<Pokemon> query = entityManager.createQuery("from Pokemon", Pokemon.class);

        return query.getResultList();
    }

    @Override
    public Pokemon findByID(int id) {

        return entityManager.find(Pokemon.class, id);
    }

    @Override
    public Pokemon save(Pokemon pokemon) {

        return entityManager.merge(pokemon);
    }

    @Override
    public void deleteById(int id) {

        Pokemon pokemon = findByID(id);

        entityManager.remove(pokemon);

    }
}
