package com.bismuthsoft.drugcalc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class RecipeContainer {
    
    @Id
    @GeneratedValue
    private long id;

    private long quantity;

    private long containerId;

    @ManyToOne
    @JoinColumn(name="recipe_id")
    private Recipe recipe;

}
