package com.dj.recipe_project.domain;


import jakarta.persistence.*;

@Entity
public class UnitOfMeasure { // reference table

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    String uom;

    @OneToOne
    private Ingredient ingredient;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
