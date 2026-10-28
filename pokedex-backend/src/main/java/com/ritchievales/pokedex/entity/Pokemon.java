package com.ritchievales.pokedex.entity;

import jakarta.persistence.*;

@Entity
public class Pokemon {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="height")
    private int height;

    @Column(name="weight")
    private int weight;

    @Column(name="base_experience")
    private int baseExperience;

    @Column(name="generation")
    private int generation;

    @Column(name="is_legendary")
    private boolean isLegendary;

    @Column(name="is_mythical")
    private boolean isMythical;

    @Column(name="description")
    private String description;

    @Column(name="sprite_url")
    private String spriteUrl;

    public Pokemon(){}

    public Pokemon(int id, String name, int height, int weight, int baseExperience, int generation, boolean isLegendary, boolean isMythical, String description, String spriteUrl) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.baseExperience = baseExperience;
        this.generation = generation;
        this.isLegendary = isLegendary;
        this.isMythical = isMythical;
        this.description = description;
        this.spriteUrl = spriteUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    public void setLegendary(boolean legendary) {
        isLegendary = legendary;
    }

    public boolean isMythical() {
        return isMythical;
    }

    public void setMythical(boolean mythical) {
        isMythical = mythical;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpriteUrl() {
        return spriteUrl;
    }

    public void setSpriteUrl(String spriteUrl) {
        this.spriteUrl = spriteUrl;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", baseExperience=" + baseExperience +
                ", generation=" + generation +
                ", isLegendary=" + isLegendary +
                ", isMythical=" + isMythical +
                ", description='" + description + '\'' +
                ", spriteUrl='" + spriteUrl + '\'' +
                '}';
    }
}
