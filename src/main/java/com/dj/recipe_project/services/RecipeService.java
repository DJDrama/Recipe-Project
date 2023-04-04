package com.dj.recipe_project.services;

import com.dj.recipe_project.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
