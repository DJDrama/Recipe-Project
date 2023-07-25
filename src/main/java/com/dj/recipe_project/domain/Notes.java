package com.dj.recipe_project.domain;

import jakarta.persistence.*;
import lombok.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne // don't need cascade since Recipe owns Notes
    private Recipe recipe;
    @Lob // clob (character large object)
    private String recipeNotes;

}
