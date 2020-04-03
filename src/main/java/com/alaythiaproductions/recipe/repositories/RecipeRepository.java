package com.alaythiaproductions.recipe.repositories;

import com.alaythiaproductions.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {



}
