package com.ritchievales.pokedex.rest;

import com.ritchievales.pokedex.entity.Pokemon;
import com.ritchievales.pokedex.service.PokemonService;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.json.JsonMapper;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PokemonRestController {

    private final PokemonService pokemonService;

    private JsonMapper jsonMapper;

    public PokemonRestController(PokemonService pokemonService, JsonMapper jsonMapper){
        this.pokemonService = pokemonService;
        this.jsonMapper = jsonMapper;
    }

    @GetMapping("/pokemon")
    public List<Pokemon> findAll(){
        return  pokemonService.findALl();
    }

    @GetMapping("/pokemon/{pokemonId}")
    public Pokemon getPokemonById(@PathVariable int pokemonId){

        Pokemon pkmn = pokemonService.findByID(pokemonId);

        if(pkmn == null){
            throw new RuntimeException("Pokemon id not found: " + pokemonId);
        }

        return pkmn;
    }

    @PostMapping("/pokemon")
    public Pokemon addPokemon(@RequestBody Pokemon pkmn){
        return pokemonService.save(pkmn);
    }

    @PutMapping("/pokemon")
    public Pokemon updatePokemon(@RequestBody Pokemon pkmn){
        return pokemonService.save(pkmn);
    }

    @PatchMapping("/pokemon/{pokemonId}")
    public Pokemon patchPokemon(@PathVariable int pokemonId,
                                @RequestBody Map<String, Object> patchPayload){
        Pokemon pkmn = pokemonService.findByID(pokemonId);
        if(pkmn == null){
            throw new RuntimeException("Pokemon id not found: " + pokemonId);
        }

        Pokemon patchedPokemon = jsonMapper.updateValue(pkmn,patchPayload);

        return pokemonService.save(patchedPokemon);
    }

    @DeleteMapping("/pokemon/{pokemonId}")
    public String deletePokemon(@PathVariable int pokemonId){
        Pokemon pkmn = pokemonService.findByID(pokemonId);

        if(pkmn == null){
            throw new RuntimeException("Pokemon not found " + pokemonId);
        }

        pokemonService.deleteById(pokemonId);

        return "Deleted pokemon id: " + pokemonId;

    }


}
