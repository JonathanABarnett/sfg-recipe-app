package com.alaythiaproductions.recipe.services;

import com.alaythiaproductions.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
