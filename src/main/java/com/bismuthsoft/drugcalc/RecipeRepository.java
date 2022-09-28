package com.bismuthsoft.drugcalc;

import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    
}
