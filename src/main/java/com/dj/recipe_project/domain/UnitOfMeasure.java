package com.dj.recipe_project.domain;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class UnitOfMeasure { // reference table

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    String uom;

    @OneToOne
    private Ingredient ingredient;

}
