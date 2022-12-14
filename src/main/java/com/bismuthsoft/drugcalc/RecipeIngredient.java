package com.bismuthsoft.drugcalc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class RecipeIngredient {
    
    @Id
    @GeneratedValue
    private long id;

    private String unit;
    private long quantity;

    private long ingredientId;

    @ManyToOne
    @JoinColumn(name="recipe_id")
    private Recipe recipe;

}
